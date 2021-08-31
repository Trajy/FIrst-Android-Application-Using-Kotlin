# FIrst Android Application Using Kotlin

here you can found out a simple applicantion to calculate bmi (body mass index), the intent behind this project is learn about android application structure, layouts, callbacks, how activities relate to Java classes and implement basic methods.

<div style="display: inline_block"> <img align="left" alt="IntelliJ-Logcat" src="https://lh3.googleusercontent.com/bsm1mRj9_jdmvBq6PQdlbpwVSQj_RKxAPpL8ifJLg6wM-Ag0hcd7Tvi_6VJva7HaNM2mpbuLq3LgiZv0CmpYKtakaxrYBdb6pKBj2PoKZlMUvYIMcRCQamDiCE1E0dl9hcVWr2xJDZXR5WbPQopV8Vwdf4i6_1xRfQh1kxnDhnln6nP2HxakQQvTmnLAwV7R7d48l-LQUBXZYmpcVpLNo26D5JWB1h_JEvfy74uRkn9ErlV5ODYrxKt97_CDLWRvuBI6aM-TbCuLu1eujXrHQq3btI7OMppGbR5XSW597VfPrEC0EQc9K8y_dZSbsMGKamC5I5VpB3Vamd4kshT1LmIvsYUy-K8OxYsdJYMpxIARH7nFZt8S8odkWjzxMwHmiKlD6u93RcZmLbh4WRVIWYgd0cTbi4IFWyr6_CMASSMJoDgXHDQrpcz0MdaOwQ9GnHJxMQl2rKT1nffIxije6QvbyiCHSvsRXvexzWPnoj2IttXZoHGzGOXzpqeRHT1MQFx1FKGxISdj9pRhlARh41hA2j8gIjqqKMTynJpayhz5F1qFF4hSyb80VZMrEGLetsNTOvRWSyTRrWb_xR8OIpz4aq52a8cC65K9UvlFd5JS0Wui-6WcpzI7tpMysHY3JgY4ESEs6mTOP1sf87Q-34S5t0NxR2obf-3jhYpwP6ntEoYGDpXWTZU0YGFpKS_kFlB90jSyir_JDZdlA3hXfnaf=w252-h516-no?authuser=0"><img align="left" alt="IntelliJ-Logcat" src="https://lh3.googleusercontent.com/jyD_mSJ_uWAqx3GsM-kCEogNpOZ28mQq_8tXZ1qjHpN4dzMwUfMSxKpWhO0NcuTJd_5GreC6TRZNxPdhZ99iMKpq0psaZ2qIb4IvYO0esqF2llMCnHICdNAQkPmDMyqDG5i9ZxecSnwA8AfOftN0L-W7TBTs6ZzPWHZPEVvH_ktnwEqfcF4Rv-El12oerds2wpNTrS8LAgSUPLIcxqyY1ORBPXlIQNvtqCvDQo6LlzU_pl1mzYr5N7-r3OzINa5y0x_8yZg3_8eNPfy8yM10xhTTKy0c205mCeyR9qnZG2KiuX5WowHwnatr4vNfYlW0rA5lwjnka4GBi3sYrkijXqOvEAycb-MOp1_IMoAZSaAVdi-fpcEpJxJTkCo4fNNpDww7r8f0E-4c_69qfuDH8VwUh5vghBCSwozubQyzn-3pRO2e2lG-xjOI5yBVTyDL0J60scmI7gDH2kK6qFyaMM9oVqyUNH7IUHnz6a4y4GvYqlV5vH0zmFOwZljnGjjp2NINWU0JVXfOG8Ex1aktun8BbVNVmZwD9uKZFyM5Owc199-hkmG1uwqi4UqqOJDi0OB486d0kEBZL_pi5TGTKvxssRueZeal2Ewp6o_DBazTZE7JfkCm4JgRO_8Xn3j_H_249fh3GmyvOYeov0902aDDTR3oA6j_I5BDBCsCcumrT-FHQr4kKPLHIiGKiXCKOTFz-AU1yPYt9TtoOI_Ge36S=w252-h516-no?authuser=0"><img align="left" alt="IntelliJ-Logcat" src="https://lh3.googleusercontent.com/TMBaSXpEcADzvDj0eqpxB5Ioqm2MZ3snsLFFVTflQ0FOXeBH_kWNE853bljtFIGs2P63YiH0YQqQMNlczVFRj290ZHgX-km9ljCD88OTxKkEq5uIdfhBqQJk4mfv7UzuMJLtaj-AJh6kc0R9AAXiOUKDrMevA1cr9u9XIDkUp8mLa52snfHtBODqYCWFyrvzzHhPAoF-KR8Qjx0dzfjljb8XDxa0pY7-aiDUW9_ArW0XgV0bN-B7gOCK-wz0m6ua11gLZN-Afg7NlYINzeS-Kro4cTOVRB45qoxX4YJ1TD0pe0wcLNwE5pfwfgkD7alNbBe6jU3FXrgGRi8pPEMQ5Brezew2R5NszpOX5bANUjzCtt-WD9Vrj-x9qHkyKU_SwkmJlNsrNPQDtfHmFj5o6ab4Gu8mlIfO036p43WdrXvKUfXFbg57nUVaDuSTdCBoulldh5dbK6VZGn_KLbRGlEj0DcZXQlrl3eDZKi_93ON9P1hlIN2xPCCMnnjWnDi9oJIzm1PU-NkYJajQl9N5dPSRVa07mOc9rvkMFzrIRSlM2ExrGZsEgyiim1X7-vAUv--6DhgehX6K4xDvg5H6vSe9zF9UxsDUi5zwJeKK662R23A-0K7Q7-jCjmuslO8kFEcY7NSIPCadBYyu6HnUsDQROSLmUg6wsYbepK0g6l_sHS5bvTDQh5LMq9vwz2ypEptoWXpXfL93s7dAQXcRgOcZ=w252-h516-no?authuser=0"><br></div>

<div>
   <div>
      <h2>Project Features</h2>
   </div>

- <div> <img align="left" alt="Trajy-Java" height="25" width="25" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/kotlin/kotlin-original.svg"></div> Kotlin 

- <div> <img align="left" alt="Trajy-Java" height="25" width="25" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/android/android-plain.svg"></div> Android Studio IDE

- <div> <img align="left" alt="Trajy-Java" height="25" width="25" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/gradle/gradle-plain.svg"></div> Gradle 7.0.1
</div>

## Layouts

### Linear Layout

- views (elements) is sorted one then other vertical or horizontal

- views can´t be overlapped

  <div> <img align="left" alt="IntelliJ-Logcat" src="https://lh3.googleusercontent.com/CbNhg4Jvt5VsucXb8Ue-lIlFemOzOypz-pDDIku19-xYKAzxCg9mu5rYg27NEsmfS_C3RYImJ7WJtUK5i32M4tD1uQRSIyIjmf3Q2S40Yy0DCWh0qNKujOJPN4U-Q89Yu1E7L8e6joUFoQvrYoX1FkaAp9B1mIV_M_19uuNiu1hVM5hW3z7ztY3mVtxF7rYbJ2PI43Kb-_1_hj13a8J3ZFukM2-eWA3BPvhnU2_qOQKLUQFozB8s23rD8YE8eKFuLMUE0MYM3eQSQBMWfare1ma2XGT4tsHL6HRjRhLbaW9_8B0rqlUqBR2cuMcnG2McyEMvXHxUx079NyeFKwsVObCUc08ZwSWMXJL8NO-G0MsQc604u7K7-xDA42DyfYQUwR4aF47D8Fk0TfbK31Rw7mSP4sIx9OAfkitmYgMh7UNi0zFQLCMw29P7ArACJtvSOX3tw2vNifKfBCN2ICvrYSz8NDmfVa0DbKu6bCe3v-rt4rqaAtVPGFRvMxDQGMxJCwgyj-BAPuSBWkej01du_5IWfwfkz9--Lw5uGjM6EjFUFOGJywuKrRQJTHcxEFZqDtsJY3-Uh6i8LBjJdQZVChJOKRGDF5cw1eYo4JuXjfyLCIUpaKiVzIDDssvgXUtC1UTvB_x9tm6xeAZF9Na1lajpqzUnF-KXrK1Ywtz8NxXHSeJTO3gvabGEhrj4VHfq4f9n8CY_s8z2em_QONlAcnfH=w580-h381-no?authuser=0"></div>

















### Relative Layout

- The position of views is relative by other views or main layout
- views can be overlapped
- it doesn't chained layouts
- need to create a complex views relationship

<div> <img align="left" alt="IntelliJ-Logcat" src="https://lh3.googleusercontent.com/C8E83Ci60Dn6se4bvuMcNPLMqDaELwvu0CIugrmr2ppDIugkPYoF4U7SoN1UAPBpf7xa7jO9hb31vXpRiKksO2C9tk7fGTy-yK05UTb3mW4-eFc-cS-lS6bd9yCfOoWetEo5fZiuu5n438hQTklWisqEt9o3I-psDGyGvcJtSQUASlFgXJtJIw1o7pq6p-0jMAUE2fEZD_nqi708uZA2cRrd26Em2OvNyzLt5ERzQT0Fv4W21xpqSVmaIZZw441djwMvg-4NkbCGNkIXvQnFhOJWFjSiLVK67Op3fR6LjLdbzvSALcrLoO-mxxKlRDLs1xs1L_Ax1d-PgPC4JgE4NHb3bBI8-QkuW_ClDv9PG9kDWcoWebZrvdRCVyu_9hsP2Z0g0eq9oaqbC9bnAcdsE8bOM0BK9WWpmvpEFmIpZbowdAfdhOBgypGIQBNS6EmFftPZJ2AXRWWPKhH--GzUuQk6mVl3-0DbVMqshmtL7UvRpl0GM7GXSD1XxZ8cFyNDtJByLA2_3jpZuKVhlQWNQkiIR9R6C3riHLllbeKZ4qXGYSF3CHhj3DUlQliPN9vZDu3JSz6CW5umWBSqs11Y9G-ivU25JXaor9if6kDaZxkd8FyXHSd3DvYpWORhN0nil8ndw3bpHQTJV1iwtLh39u06J9UWoTurWjOFfL9-9qUcKU7E_bEVsG_X_jxk9653jZw8FRILlk1P9PGHL3MzX8m4=w258-h380-no?authuser=0"></div>

















### Constraint Layout

- is based to restrict views to other views or main layout

- its focus is optimization replacing Linear and Relative Layout

- is based on forces applied to views through imaginary springs

  <div> <img align="left" alt="IntelliJ-Logcat" src="https://www.journaldev.com/wp-content/uploads/2018/07/android-constraint-layout-remove-constraints.gif.webp"></div>

















## Useful notes

- Activities are implemented using XML language, it has two similar namespaces, "android" and "tools", both has same atributes but the namespace "tools" only works in IDE environment (for more read "tools: instead of android:" section at [Tools Attributes Reference Documentaion](https://developer.android.com/studio/write/tool-attributes?hl=pt-br)).

- You can find a life cycle exemple, generanting logs looking for tag "W/Lifecycle" in Android Studio's logcat to describe which callback step application is running ([CallBacks Documentaion](https://developer.android.com/guide/components/activities/activity-lifecycle?hl=pt-br)).

<div> <img align="left" alt="IntelliJ-Logcat" src="https://lh3.googleusercontent.com/xb1-P7xE33bNUv8OktqxdZcp-GaS-2qfKZnT-MPH0xKpEwhe9PDqoLj1-EswJuNH7O3QzThB9dCA8vNTdEIAG3HAyYEAVeIEQlzUGQ23TaDBZBMPJ70S-vqBNU9lprIKcGJGPHHTa5d-nw5qwjuUAXKIkfmxj__hN_emAnDczV0zmrvDC4XkG7jYMYBfl3cZDblulqmwEwuywNya9ibIJOlC41U_g97g2BpsE_oiPco1ibeREW1UHzxxHxWP0gmBcG059H5Lr1oA_W5yF5AauSE2GCtdF4mUy1Za7n_t7xFNb2DQC0tHq3LFLtoUjt1SSpKUrjCtT1BmI6BapXZlZocfUcY97Xusdm-sSEs0sQhkEe50QzYOqPsdYqYZ8Hk-vCRC9zGbir_sBfgTbOHLAJvr8F7DR7G-FXo8SnmwXov8oIPypMf_c7vcSo16oUKlbYK5dzFwtkNBWkehcvP2SOcUaXv-Qceb3i5rD85VsZS2zKgmveAynztTL2FTjioSj0NUpsidUjGAsK-bpxQ24cKeAdi4HEGufboDM1qAJQy2qUc3AHbpIAVGtudStZElKY6yXlxIf-Ao75YgAjqpcGLH--8pEMmLmNng4kwwMvuBqgims0BQz0J1HSZKJIaIiJFr3eGJGi7IaOksJAuFru8Tu3_5Bl5VXVSAdcEl0oWlyIIFGddQ82QNAyUbF3drWGs1ipuzdjvv5fcaoikgJgrH=w1366-h215-no?authuser=0"></div>









## Documentation

- [Android with Kotlin](https://developer.android.com/kotlin/first)

- [CallBacks](https://developer.android.com/guide/components/activities/activity-lifecycle?hl=pt-br)

- [Tools Attributes Reference](https://developer.android.com/studio/write/tool-attributes?hl=pt-br)

- [kotlin id plugin](https://antonioleiva.com/kotlin-android-extensions/)

  

- 





