/* eslint-env node */
"use strict";

let path = require("path");

module.exports = {
	entry: "./src/main/frontend/index.js",
	output: {
		path: path.join(__dirname, "src/main/resources/static"),
		filename: "application.js"
	},
	resolve: {
	  modules: [__dirname, 'node_modules'],
	},
	module: {
		rules: [{
			loader: "babel-loader",
			options: {
				presets: ["@babel/preset-env"],
				cacheDirectory: true
			}
		}]
	}
};
