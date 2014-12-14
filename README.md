[![Build Status](https://travis-ci.org/LoyolaChicagoCode/primenumbers-android-scala.svg?branch=master)](https://travis-ci.org/LoyolaChicagoCode/primenumbers-android-scala) 
[![Coverage Status](https://img.shields.io/coveralls/LoyolaChicagoCode/primenumbers-android-scala.svg)](https://coveralls.io/r/LoyolaChicagoCode/primenumbers-android-scala) 
[![Download](https://api.bintray.com/packages/loyolachicagocode/generic/primenumbers-android-scala/images/download.svg) ](https://bintray.com/loyolachicagocode/generic/primenumbers-android-scala/_latestVersion)

# Background

The goal of this example is to demonstrate the tradeoffs found in
the mobile + cloud architecture, where one has a choice between
doing work locally (on the mobile device) versus remotely (in 
the cloud) with different performance considerations in each case.

This is a very rough initial attempt and still needs significant work.

# Learning Objectives

- Show how CPU-intensive computation can be off-loaded from a mobile app to
  the cloud, by comparison to a mobile device, an unlimited resource for
  computation and storage.
- synchronous local foreground tasks in Android (running directly in an event listener)
- asynchronous local background tasks in Android using [AsyncTask](http://developer.android.com/reference/android/os/AsyncTask.html)
- asynchronous access of remote resources (usually RESTful web services) in Android using [AsyncHttpClient](http://loopj.com/android-async-http)
- remote logging to a [cloud-based exception monitoring service](https://rollbar.com)

See also the [corresponding web service](https://github.com/LoyolaChicagoCode/primenumbers-spray-scala)

# Building and Running

Please refer to [these notes](http://lucoodevcourse.github.io/notes/scalaandroiddev.html) for details.

## Sample prime numbers to try

- 1013
- 10007
- 100003
- 1000003
- 10000169
- 100000007

# Sample non-prime numbers to try

- 999989

# References

- [Jason Christensen's OOPSLA 2009 presentation](http://www.slideshare.net/jasonc411/oopsla-2009-combining-rest-and-cloud-a-practitioners-report)

# TODO

* improve UI
* improve architecture
* architectural diagram
* testing
* define task in a way that it can be decomposed! 
  (e.g. each task to check divisibility within a specific range)
* typed AsyncTask that hides the need to use AnyRef for input and progress values
* make more functional
