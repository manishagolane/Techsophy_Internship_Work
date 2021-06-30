import { Avatar, IconButton } from '@material-ui/core';
import { AttachFile, MoreVert, SearchOutlined } from '@material-ui/icons';
import './Chat.css';
import InsertEmoticonIcon from '@material-ui/icons/InsertEmoticon';
import MicIcon from '@material-ui/icons/Mic';
import React,{useState} from 'react';


function Chat() {

    const [input, setInput]  = useState("");
    const sendMessage = (e) =>{
            e.preventDefault();
            console.log("Typed input is :",input);

            setInput("");
    }
    return (
        <div className="chat">
            <div className="chat_header">
            <Avatar src="https://avatars0.githubusercontent.com/u/53967697?s=400&u=8359042b79c45d0070a0a2ab464b3274ff175c65&v=4"/>
                <div className="chat_headerInfo">
                    <h3>Name</h3>
                    <p>Last seen at.....</p>
                </div>
                <div className="chat_headerRight">
                    <IconButton>
                        <SearchOutlined />
                    </IconButton>
                    <IconButton>
                        <AttachFile />
                    </IconButton>
                    <IconButton>
                        <MoreVert />
                    </IconButton>
                </div>
            </div>
            <div className="chat_body">
                <p className={`chat_message ${true && "chat_reciever"}`}>
                <span className="chat_name">Manisha</span>
                Heyy friends!!
                <span className="chat_timestamp">12:30pm</span>
                </p>

            </div>

            <div className="chat_footer">
                <InsertEmoticonIcon />
                <form>
                    <input 
                    value = {input}
                    onChange = {(e) => setInput(e.target.value)}
                    placeholder="Type a message" type="text" />
                    <button  onClick ={sendMessage} type="submit">
                        Send a message
                    </button>
                </form>
                <MicIcon />
            </div>
        </div>
    )
}

export default Chat;
