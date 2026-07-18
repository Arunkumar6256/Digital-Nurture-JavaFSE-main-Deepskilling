import React, { Component } from "react";

class App extends Component {

  constructor(props) {
    super(props);

    this.state = {
      count: 0
    };
  }

  increment = () => {
    this.setState({
      count: this.state.count + 1
    });
  };

  decrement = () => {
    this.setState({
      count: this.state.count - 1
    });
  };

  sayHello = () => {
    alert("Hello! Welcome to React Event Handling.");
  };

  handleIncrement = () => {
    this.increment();
    this.sayHello();
  };

  render() {
    return (
      <div style={{ textAlign: "center", marginTop: "50px" }}>
        <h1>Counter Application</h1>

        <h2>Counter Value: {this.state.count}</h2>

        <button onClick={this.handleIncrement}>
          Increment
        </button>

        &nbsp;&nbsp;

        <button onClick={this.decrement}>
          Decrement
        </button>
      </div>
    );
  }
}

export default App;