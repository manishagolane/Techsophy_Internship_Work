import React from 'react';
import './SidebarChat.css';
import { Avatar } from '@material-ui/core';

function SidebarChat() {
    return (
        <div className="sidebarChat">
            <Avatar src="https://avatars0.githubusercontent.com/u/53967697?s=400&u=8359042b79c45d0070a0a2ab464b3274ff175c65&v=4"/>
            <div className="sidebarChat_info">
                <h2>Name</h2>
                <p>This is the last message</p>
            </div>
        </div>
    )
}

export default SidebarChat
