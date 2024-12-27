//Traemos Sequelize

const { Sequelize } = require('sequelize');

//documentación para ingresar a la base de datos

const db = new Sequelize("DATABASE_NAME", "DATABASE_USER", "DATABASE_PASSWORD", {
    host: "HOST",
    dialect: "DIALECT",
    port: PORT
})

module.exports = db
