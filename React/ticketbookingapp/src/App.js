import React, { Component } from "react";
import GuestPage from "./GuestPage";
import UserPage from "./UserPage";

class App extends Component {

    constructor(props) {
        super(props);

        this.state = {
            isLoggedIn: false
        };
    }

    login = () => {
        this.setState({
            isLoggedIn: true
        });
    };

    logout = () => {
        this.setState({
            isLoggedIn: false
        });
    };

    render() {

        return (

            <div style={{ textAlign: "center" }}>

                <h1>Ticket Booking Application</h1>

                {
                    this.state.isLoggedIn
                        ? <UserPage />
                        : <GuestPage />
                }

                <br />

                {
                    this.state.isLoggedIn
                        ? (
                            <button onClick={this.logout}>
                                Logout
                            </button>
                        )
                        : (
                            <button onClick={this.login}>
                                Login
                            </button>
                        )
                }

            </div>

        );
    }
}

export default App;