# Duct middleware Anti-Forgery

[![Clojars Project](https://img.shields.io/clojars/v/duct-middleware-anti-forgery.svg)](https://clojars.org/kwrooijen/duct-middleware-anti-forgery)

## Usage

`project.clj`

```clojure
:dependencies [[kwrooijen/duct-middleware-anti-forgery "0.1.0"]]
```

`config.edn`

```clojure
{:duct.profile/base
 {:duct.router/reitit
  {:routes
   [["/"
     {:middleware [#ig/ref :duct.middleware/anti-forgery]}
     [,,,]]]}
  :duct.middleware/anti-forgery {}}}
```

## Author / License

Released under the [MIT License] by [Kevin William van Rooijen].

[Kevin William van Rooijen]: https://twitter.com/kwrooijen

[MIT License]: https://github.com/kwrooijen/gungnir/blob/master/LICENSE
