# GraphHitDetector 🎯

![GraphHitDetector](https://img.shields.io/badge/GraphHitDetector-Ready-brightgreen)

Welcome to the **GraphHitDetector** repository! This full-stack web application allows users to check if points fall within a specified area on a coordinate plane. It features JWT authentication and a responsive interface. 

## Table of Contents

- [Introduction](#introduction)
- [Features](#features)
- [Technologies Used](#technologies-used)
- [Getting Started](#getting-started)
- [Usage](#usage)
- [Contributing](#contributing)
- [License](#license)
- [Links](#links)

## Introduction

GraphHitDetector is designed for those who want a simple and efficient way to verify point inclusion in geometric shapes. Whether you're a developer looking for a project or a user wanting to interact with coordinate geometry, this app provides a seamless experience.

## Features

- **JWT Authentication**: Secure your application with JSON Web Tokens.
- **Responsive Design**: Enjoy a user-friendly interface on any device.
- **Real-time Point Checking**: Quickly determine if points fall within the designated area.
- **Interactive Graphs**: Visualize your points and areas on a dynamic graph.
- **Docker Support**: Easily deploy the application using Docker.

## Technologies Used

This project utilizes a variety of technologies to ensure a robust and efficient application:

- **Backend**: Java EE, EJB, Hibernate, JPA
- **Frontend**: React, Redux, PrimeReact, Vite
- **Database**: PostgreSQL
- **Authentication**: JWT
- **Containerization**: Docker

## Getting Started

To get started with GraphHitDetector, follow these steps:

1. **Clone the Repository**: 
   ```bash
   git clone https://github.com/rks9420/GraphHitDetector.git
   cd GraphHitDetector
   ```

2. **Set Up Environment**: Ensure you have Docker installed on your machine.

3. **Build the Application**: Use Docker to build and run the application.
   ```bash
   docker-compose up --build
   ```

4. **Access the Application**: Open your web browser and navigate to `http://localhost:3000`.

## Usage

After setting up the application, you can start using it right away. Here’s how:

1. **Login**: Use your credentials to log in. If you don't have an account, you can register directly from the login page.
2. **Input Points**: Enter the coordinates of the points you want to check.
3. **Select Area**: Choose the geometric shape where you want to check for point inclusion.
4. **Check Points**: Click the button to see if the points fall within the selected area.

### Example

To check if the point (3, 4) is within a circle centered at (0, 0) with a radius of 5, simply input the coordinates and select the circle option.

## Contributing

We welcome contributions to GraphHitDetector! If you'd like to contribute, please follow these steps:

1. Fork the repository.
2. Create a new branch (`git checkout -b feature/YourFeature`).
3. Make your changes.
4. Commit your changes (`git commit -m 'Add some feature'`).
5. Push to the branch (`git push origin feature/YourFeature`).
6. Open a pull request.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

## Links

For the latest updates and releases, please visit the [Releases](https://github.com/rks9420/GraphHitDetector/releases) section. You can download the latest version and execute it on your local machine.

For further information and to stay updated, you can also check the [Releases](https://github.com/rks9420/GraphHitDetector/releases) section for any new updates.

---

Thank you for checking out GraphHitDetector! We hope you find it useful and engaging. If you have any questions or feedback, feel free to reach out through the issues section of this repository. Happy coding!