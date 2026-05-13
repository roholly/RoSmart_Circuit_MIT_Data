# RoSmart Circuit — Smart Meter Reporting Web Application

**Domain:** Energy Disaggregation · Business Intelligence  
**Tools:** Java, JSP/JSTL, MySQL, Tomcat, Chart.js, Bootstrap  
**Data:** MIT Reference Energy Disaggregation Dataset (REDD)  
**Scope:** Java and database development, data aggregation and statistical analysis, graphical reporting

---

## Overview

Proof-of-concept Java web application displaying electrical consumption data from six anonymous homes in the Boston area, using data from the MIT Reference Energy Disaggregation Data Set (REDD) program (http://redd.csail.mit.edu/).

---

## The Data

The source data consisted of logged smart meter power circuit readings — approximately once per second for main circuits and once every three seconds for individual circuits (refrigerator, lighting, bathroom outlet, dishwasher, etc.). The overall timeframe spanned an average of 1.5 months per house, with individual circuit files containing as many as 30 million lines — one line per power reading.

Aggregated the right way, that data stops being a wall of numbers and starts being a portrait of how people actually live. Which circuits run on holiday weekends versus weekdays. When laundry gets done. What's still drawing power at 2am. The goal was to make that legible — to a homeowner trying to understand their bill, or a utility analyst looking for behavioral patterns worth acting on during a billing cycle rather than after it.

---

## The Approach

Source data was aggregated to hourly and daily consumption averages by circuit type and stored in a MySQL database feeding the web application. The application allowed users to view consumption patterns by appliance category and timeframe through charts and graphs.

**Architecture** — Browser requests route through Apache Tomcat to Java servlets, which query MySQL via JNDI connection pooling, map results to domain objects, and forward to JSP views rendered with Chart.js and Bootstrap. A standard MVC pattern with clean separation between data access (HouseManager, DataManager), domain objects (House, HouseDailyAverages), servlet controllers, and JSP views.

**Real-time design intent** — The aggregation layer was designed with production operation in mind. In a real deployment, automated stored procedures and backend processing would replace the batch aggregation, feeding the application with current-cycle data rather than historical.

---

## What This Demonstrates

- Data aggregation pipeline design: reducing tens of millions of raw readings to human-consumable statistics
- Full-stack Java web application development across database, business logic, and presentation layers
- MVC architecture with clean separation of concerns
- Schema design for time-series aggregation queries
- Working with real research datasets not designed for immediate application use
- Proof-of-concept design with real-world deployment considerations built in
