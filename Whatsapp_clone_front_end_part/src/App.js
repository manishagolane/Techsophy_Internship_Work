import Chat from './Chat';
import Sidebar from './Sidebar';
import './App.css';

function App() {
  return (
    <div className="app">
    <div className="app_body">
      {/*Sidebar*/}
      <Sidebar/>
      {/*Chat Component*/}
      <Chat/>
    </div>
  </div>

  );
}

export default App;
