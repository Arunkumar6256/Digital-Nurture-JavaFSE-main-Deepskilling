import React from "react";

function GuestPage() {
    return (
        <div>
            <h2>Welcome Guest</h2>

            <h3>Flight Details</h3>

            <table border="1" cellPadding="10">
                <thead>
                    <tr>
                        <th>Flight</th>
                        <th>Source</th>
                        <th>Destination</th>
                    </tr>
                </thead>

                <tbody>
                    <tr>
                        <td>AI101</td>
                        <td>Hyderabad</td>
                        <td>Delhi</td>
                    </tr>

                    <tr>
                        <td>6E205</td>
                        <td>Chennai</td>
                        <td>Mumbai</td>
                    </tr>

                    <tr>
                        <td>SG404</td>
                        <td>Bangalore</td>
                        <td>Kolkata</td>
                    </tr>
                </tbody>
            </table>

            <h3>Please Login to Book Tickets.</h3>
        </div>
    );
}

export default GuestPage;