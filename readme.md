# FIrst Android Application Using Kotlin

here you can found out a simple applicantion to calculate bmi (body mass index), the intent behind this project is learn about android application structure, layouts, callbacks, how activities relate to Java classes and implement basic methods.

<div style="display: inline_block"> <img align="left" alt="Application" src="https://lh3.googleusercontent.com/bsm1mRj9_jdmvBq6PQdlbpwVSQj_RKxAPpL8ifJLg6wM-Ag0hcd7Tvi_6VJva7HaNM2mpbuLq3LgiZv0CmpYKtakaxrYBdb6pKBj2PoKZlMUvYIMcRCQamDiCE1E0dl9hcVWr2xJDZXR5WbPQopV8Vwdf4i6_1xRfQh1kxnDhnln6nP2HxakQQvTmnLAwV7R7d48l-LQUBXZYmpcVpLNo26D5JWB1h_JEvfy74uRkn9ErlV5ODYrxKt97_CDLWRvuBI6aM-TbCuLu1eujXrHQq3btI7OMppGbR5XSW597VfPrEC0EQc9K8y_dZSbsMGKamC5I5VpB3Vamd4kshT1LmIvsYUy-K8OxYsdJYMpxIARH7nFZt8S8odkWjzxMwHmiKlD6u93RcZmLbh4WRVIWYgd0cTbi4IFWyr6_CMASSMJoDgXHDQrpcz0MdaOwQ9GnHJxMQl2rKT1nffIxije6QvbyiCHSvsRXvexzWPnoj2IttXZoHGzGOXzpqeRHT1MQFx1FKGxISdj9pRhlARh41hA2j8gIjqqKMTynJpayhz5F1qFF4hSyb80VZMrEGLetsNTOvRWSyTRrWb_xR8OIpz4aq52a8cC65K9UvlFd5JS0Wui-6WcpzI7tpMysHY3JgY4ESEs6mTOP1sf87Q-34S5t0NxR2obf-3jhYpwP6ntEoYGDpXWTZU0YGFpKS_kFlB90jSyir_JDZdlA3hXfnaf=w252-h516-no?authuser=0">
  <img align="left" alt="Application" src="https://lh3.googleusercontent.com/jyD_mSJ_uWAqx3GsM-kCEogNpOZ28mQq_8tXZ1qjHpN4dzMwUfMSxKpWhO0NcuTJd_5GreC6TRZNxPdhZ99iMKpq0psaZ2qIb4IvYO0esqF2llMCnHICdNAQkPmDMyqDG5i9ZxecSnwA8AfOftN0L-W7TBTs6ZzPWHZPEVvH_ktnwEqfcF4Rv-El12oerds2wpNTrS8LAgSUPLIcxqyY1ORBPXlIQNvtqCvDQo6LlzU_pl1mzYr5N7-r3OzINa5y0x_8yZg3_8eNPfy8yM10xhTTKy0c205mCeyR9qnZG2KiuX5WowHwnatr4vNfYlW0rA5lwjnka4GBi3sYrkijXqOvEAycb-MOp1_IMoAZSaAVdi-fpcEpJxJTkCo4fNNpDww7r8f0E-4c_69qfuDH8VwUh5vghBCSwozubQyzn-3pRO2e2lG-xjOI5yBVTyDL0J60scmI7gDH2kK6qFyaMM9oVqyUNH7IUHnz6a4y4GvYqlV5vH0zmFOwZljnGjjp2NINWU0JVXfOG8Ex1aktun8BbVNVmZwD9uKZFyM5Owc199-hkmG1uwqi4UqqOJDi0OB486d0kEBZL_pi5TGTKvxssRueZeal2Ewp6o_DBazTZE7JfkCm4JgRO_8Xn3j_H_249fh3GmyvOYeov0902aDDTR3oA6j_I5BDBCsCcumrT-FHQr4kKPLHIiGKiXCKOTFz-AU1yPYt9TtoOI_Ge36S=w252-h516-no?authuser=0">
  <img align="left" alt="Application" src="https://lh3.googleusercontent.com/TMBaSXpEcADzvDj0eqpxB5Ioqm2MZ3snsLFFVTflQ0FOXeBH_kWNE853bljtFIGs2P63YiH0YQqQMNlczVFRj290ZHgX-km9ljCD88OTxKkEq5uIdfhBqQJk4mfv7UzuMJLtaj-AJh6kc0R9AAXiOUKDrMevA1cr9u9XIDkUp8mLa52snfHtBODqYCWFyrvzzHhPAoF-KR8Qjx0dzfjljb8XDxa0pY7-aiDUW9_ArW0XgV0bN-B7gOCK-wz0m6ua11gLZN-Afg7NlYINzeS-Kro4cTOVRB45qoxX4YJ1TD0pe0wcLNwE5pfwfgkD7alNbBe6jU3FXrgGRi8pPEMQ5Brezew2R5NszpOX5bANUjzCtt-WD9Vrj-x9qHkyKU_SwkmJlNsrNPQDtfHmFj5o6ab4Gu8mlIfO036p43WdrXvKUfXFbg57nUVaDuSTdCBoulldh5dbK6VZGn_KLbRGlEj0DcZXQlrl3eDZKi_93ON9P1hlIN2xPCCMnnjWnDi9oJIzm1PU-NkYJajQl9N5dPSRVa07mOc9rvkMFzrIRSlM2ExrGZsEgyiim1X7-vAUv--6DhgehX6K4xDvg5H6vSe9zF9UxsDUi5zwJeKK662R23A-0K7Q7-jCjmuslO8kFEcY7NSIPCadBYyu6HnUsDQROSLmUg6wsYbepK0g6l_sHS5bvTDQh5LMq9vwz2ypEptoWXpXfL93s7dAQXcRgOcZ=w252-h516-no?authuser=0"><br clear="all"/></div>

## Project Features

- <div> <img align="left" alt="Kotlin" height="25" width="25" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/kotlin/kotlin-original.svg"></div> Kotlin 

- <div> <img align="left" alt="Android Studio" height="25" width="25" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/android/android-plain.svg"></div> Android Studio IDE

- <div> <img align="left" alt="Gradle" height="25" width="25" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/gradle/gradle-plain.svg"></div> Gradle 7.0.1
</div>

## Layouts

### Linear Layout

- views (elements) is sorted one then other vertical or horizontal

- views can´t be overlapped

  <div> <img align="left" alt="Linear Layout" src="https://lh3.googleusercontent.com/oyWU5-lcUrkNcm9ZiQd34q0agQmvY8qL93KhczuLZlpEFHqYVYOpqT-RetzP1YHXoHKtDaWZpFULkFx6Nly7DuA48TdXEiweCfJbVDwyJeS-DNPgYhkxcG3xrSJsmJT0_K9FMX9AlwfFDD_MaIPjB5v9zzshEGZlMk-pKliw2WiPGSZnuZAahyT7PCZ0iy3LCqmbuNPSde641DRuiYqLz9C-j3hXLoMk3BT8HkKhxxJvjRoUuG9mAmZPrRMZjTomGO43_8OpZzx19o0ddFBpvYl-QlgCPYQTX7jF5G11qrZzFY3sySdH7F7dGZro6LQKlj7Kgj_xv6KiQrAgW3h6i3SwGDlMlVYyEkECn4LYJFQ0lzxvaaMQVG3okXKPiQipISGNV8BpHvzwAmK0mI0eOaJeRrLJNYNSeI4aqdO5U5ScyxYGeq6yYz3p5PEz0Lx7TcW4dosVWnyQ0kqP5ucUFnIGWbR5o7iOISLdVq_tJfxdWxATpcqX5u_tL5O-pv5lBWEC9lGA9RzGYy5eDTX2C_6vxnVcrOQK61GsYyqHj5ii8HEura0UfykZATnQZaCrmvUM2KbhfmknADavt3PK5go9561axmbvH0wfgpVsJTg3XT2wcmZNDglIefpMj_fnofMum7hRk-gFStewYej6IMb_AdhQNoy1bHWQaQWFr5dNdQR4-QmW0jtGDsP2CRusF1Ukybb48DI0gKqzD7c13sVB=w580-h381-no?authuser=0"><br clear="all"/></div>

### Relative Layout

- The position of views is relative by other views or main layout
- views can be overlapped
- it doesn't chained layouts
- need to create a complex views relationship

<div> <img align="left" alt="Relative Layout" src="https://lh3.googleusercontent.com/165gRgAgFnwfKdp1NLGg7p2xQziUi2FwSHDqY0C-3tdfY2TycpuG8BGFsOKbHj054evOFCI_wBTbyuzrRF4EILTkV2jc22L37vLcbp2y6CDaNJWETApLlWelOsuh7FpczsD3RRA5m2WpqA82PyVyQhUBwMTT-a7lvSuSWIcXaApZwvwKvZZETK0LwJ311XKaR-3M4VrgDn2o-BZtlnI1I-lg8tdZeIxs3Ujcm1GrDbGlmJqdshhhmZttxlWguHR3WCSfcwcQX5agD1HMTf3nnblsl73V72nkTOYtTTh5ZMFmRY_YlZbUoKzYMgfVDj9S1sD-Mg5NK1wYe-aAzrCo5kae16emvS5BGggr-03z2LTknmhHJoaxQhe2_Egdi9rEOArACwMugRZWSf6TfAHvQv5Svxv1C2d1GGsvi1suEBpfOvgYsXwhPziwDtWdoKzSEJmJB6R-psJ77wpA5wrXAVxSMGsdN7Kd8oYSEpo7a1Ff6KAleEEDoOsUgKBhfqXC29OPkTTje8_AewPqL4TjUYBusFlws4LjxaxCM5oPB0-J6ireZJl71ryiKMJmL8pw2AbqcC3oNf4ZmK6dxKqvZZz9TH6Q4YCtbaBe7wdfpEEkZnVKYVUUwaPuxg6w4KzEt313T7jUYFBgqpZNI5Ts7wxUJlT-14uMfbJ0g5GT9fDAEUobLRT5GWRineoiXbRomsYbfofPNSxgQpY3OzSwNTdo=w258-h380-no?authuser=0"><br clear="all"/></div>

### Constraint Layout

- is based to restrict views to other views or main layout

- its focus is optimization replacing Linear and Relative Layout

- is based on forces applied to views through imaginary springs

  <div> <img align="left" alt="Constraint Layout" src="https://www.journaldev.com/wp-content/uploads/2018/07/android-constraint-layout-remove-constraints.gif.webp"><br clear="all"/></div>

## Useful notes

- Activities are implemented using XML language, it has two similar namespaces, "android" and "tools", both has same atributes but the namespace "tools" only works in IDE environment (for more read "tools: instead of android:" section at [Tools Attributes Reference Documentaion](https://developer.android.com/studio/write/tool-attributes?hl=pt-br)).

- You can find a life cycle exemple, generanting logs looking for tag "W/Lifecycle" in Android Studio's logcat to describe which callback step application is running ([CallBacks Documentaion](https://developer.android.com/guide/components/activities/activity-lifecycle?hl=pt-br)).

<div> <img align="left" alt="Android Studio Logcat" src="https://lh3.googleusercontent.com/iKTtBZgyIs5PdNWX3tVWJAQTX9CMj5YIcyGIfxfdpJ3vgwzgtmLIZkJmDCrbREd7bX32RacOBZK_FXctyw7hrrSAgkhhdW7joV865JrfoAKbvALsNF27Qc2hJMN1vAaLGVyzZL8laKJ3-IK4tYY7e06fRJNho5s2AUTSz282ywH68uICYJAm__npikkvcppJiXa8QmKYgonH0O7KdWfdnqWRa5MInen9Nm7DAZsSTTmqIu9zN6xOk1S7ojtbjiJFojh-SuvKtSP9K_nuDziPYePNwLHLA1PaibLsE4uLLZQxQ462DhWP3nNDgedFRj-xkrNqPHo3ShQPfVfpVqHyQzhYcBj9Pq2Sa2LeWaElgLHND5KAvYi5ZY11wGZhAhZ3hl6d12HEnm9mBWhX_0XO7ROEGeKcnlYj1XtTDQHVASt7DBGLhekKoivbeFXywSQN0K52e1pDj8QWeu2dgjXErnzugccjqyosDzaXB6J7haCFK8DGyaa8-MMmHNBhEpFf3HGY1kd1hdE4BNgMSSWJeAUrnpsuaxZZ9z1hISA8PNJ1qhIhcvPSAZhptxD7uaE6IPwrtzaSY7soWMFGfMVfQl4jC4jOzT6jRG2YxLyHNhfayvkiMlAyrGM6MMKfCG5f7sBhjjFQycI6CWKsIEoBI3idMNMXvYFG__s9KY11MZiHjaOeP3vr1NSz6BubIexja5L-NcpIJeSsGxqt-adQR01Z=w1366-h215-no?authuser=0"><br clear="all"/></div>

## Documentation

- [Android with Kotlin](https://developer.android.com/kotlin/first)

- [CallBacks](https://developer.android.com/guide/components/activities/activity-lifecycle?hl=pt-br)

- [Tools Attributes Reference](https://developer.android.com/studio/write/tool-attributes?hl=pt-br)

- [kotlin id plugin](https://antonioleiva.com/kotlin-android-extensions/)
