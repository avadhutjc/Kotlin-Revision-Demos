package com.ajc.kotlin_revision_demos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.delay

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnLaunch.setOnClickListener {
            val intent = Intent(this@MainActivity, SecondActivity::class.java)
            startActivity(intent)
        }
    }

    suspend fun doSomethingUsefulOne() : Int {
        delay(1000L)
        return 13
    }

    suspend fun doSomethingUsefulTwo() : Int {
        delay(1000L)
        return 29
    }


}
/*

12/19 21:50:00: Launching 'app' on Copy_of_Pixel 4 XL API 26.
Install successfully finished in 3 s 323 ms.
$ adb shell am start -n "com.ajc.kotlin_revision_demos/com.ajc.kotlin_revision_demos.MainActivity" -a android.intent.action.MAIN -c android.intent.category.LAUNCHER
Connected to process 12201 on device 'Copy_of_Pixel_4_XL_API_26 [emulator-5554]'.
Capturing and displaying logcat messages from application. This behavior can be disabled in the "Logcat output" section of the "Debugger" settings page.
D/OpenGLRenderer: HWUI GL Pipeline
D/: HostConnection::get() New Host Connection established 0xaab3dc00, tid 12228
I/OpenGLRenderer: Initialized EGL, version 1.4
D/OpenGLRenderer: Swap behavior 1
W/OpenGLRenderer: Failed to choose config with EGL_SWAP_BEHAVIOR_PRESERVED, retrying without...
D/OpenGLRenderer: Swap behavior 0
D/EGL_emulation: eglCreateContext: 0xa16850c0: maj 3 min 0 rcv 3
D/EGL_emulation: eglMakeCurrent: 0xa16850c0: ver 3 0 (tinfo 0xa1683100)
D/EGL_emulation: eglMakeCurrent: 0xa16850c0: ver 3 0 (tinfo 0xa1683100)
D/SecondActivity: Second Activity started
I/System.out: Coroutine started in DefaultDispatcher-worker-1
D/EGL_emulation: eglMakeCurrent: 0xa16850c0: ver 3 0 (tinfo 0xa1683100)
D/EGL_emulation: eglMakeCurrent: 0xa16850c0: ver 3 0 (tinfo 0xa1683100)
D/EGL_emulation: eglMakeCurrent: 0xa16850c0: ver 3 0 (tinfo 0xa1683100)
D/OpenGLRenderer: endAllActiveAnimators on 0x9f0fd200 (RippleDrawable) with handle 0xa16837f0
I/System.out: The task value is 0
I/System.out: The task value is 1
I/System.out: The task value is 2
I/System.out: The task value is 3
I/System.out: The task value is 4
I/System.out: The task value is 5
I/System.out: The task value is 6
I/System.out: The task value is 7
I/System.out: The task value is 8
I/System.out: The task value is 9
I/System.out: The task value is 10
I/System.out: The task value is 11
I/System.out: The task value is 12
I/System.out: The task value is 13
I/System.out: The task value is 14
I/System.out: The task value is 15
I/System.out: The task value is 16
I/System.out: The task value is 17
I/System.out: The task value is 18
I/System.out: The task value is 19
I/System.out: The task value is 20
I/System.out: The task value is 21
I/System.out: The task value is 22
I/System.out: The task value is 23
I/System.out: The task value is 24
I/System.out: The task value is 25
I/System.out: The task value is 26
I/System.out: The task value is 27
I/System.out: The task value is 28
I/System.out: The task value is 29
I/System.out: The task value is 30
I/System.out: The task value is 31
I/System.out: The task value is 32
I/System.out: The task value is 33
I/System.out: The task value is 34
I/System.out: The task value is 35
I/System.out: The task value is 36
I/System.out: The task value is 37
I/System.out: The task value is 38
I/System.out: The task value is 39
I/System.out: The task value is 40
I/System.out: The task value is 41
I/System.out: The task value is 42
I/System.out: The task value is 43
I/System.out: The task value is 44
I/System.out: The task value is 45
I/System.out: The task value is 46
I/System.out: The task value is 47
I/System.out: The task value is 48
I/System.out: The task value is 49
I/System.out: The task value is 50
I/System.out: The task value is 51
I/System.out: The task value is 52
I/System.out: The task value is 53
I/System.out: The task value is 54
I/System.out: The task value is 55
I/System.out: The task value is 56
I/System.out: The task value is 57
I/System.out: The task value is 58
I/System.out: The task value is 59
I/System.out: The task value is 60
I/System.out: The task value is 61
I/System.out: The task value is 62
I/System.out: The task value is 63
I/System.out: The task value is 64
I/System.out: The task value is 65
I/System.out: The task value is 66
I/System.out: The task value is 67
I/System.out: The task value is 68
I/System.out: The task value is 69
I/System.out: The task value is 70
I/System.out: The task value is 71
I/System.out: The task value is 72
I/System.out: The task value is 73
I/System.out: The task value is 74
I/System.out: The task value is 75
I/System.out: The task value is 76
I/System.out: The task value is 77
I/System.out: The task value is 78
I/System.out: The task value is 79
I/System.out: The task value is 80
I/System.out: The task value is 81
I/System.out: The task value is 82
I/System.out: The task value is 83
I/System.out: The task value is 84
I/System.out: The task value is 85
I/System.out: The task value is 86
I/System.out: The task value is 87
I/System.out: The task value is 88
I/System.out: The task value is 89
I/System.out: The task value is 90
I/System.out: The task value is 91
I/System.out: The task value is 92
I/System.out: The task value is 93
I/System.out: The task value is 94
I/System.out: The task value is 95
I/System.out: The task value is 96
I/System.out: The task value is 97
I/System.out: The task value is 98
I/System.out: The task value is 99
I/System.out: The task value is 100
I/System.out: The task value is 101
I/System.out: The task value is 102
I/System.out: The task value is 103
I/System.out: The task value is 104
I/System.out: The task value is 105
I/System.out: The task value is 106
I/System.out: The task value is 107
I/System.out: The task value is 108
I/System.out: The task value is 109
I/System.out: The task value is 110
I/System.out: The task value is 111
I/System.out: The task value is 112
I/System.out: The task value is 113
I/System.out: The task value is 114
I/System.out: The task value is 115
I/System.out: The task value is 116
I/System.out: The task value is 117
I/System.out: The task value is 118
I/System.out: The task value is 119
I/System.out: The task value is 120
I/System.out: The task value is 121
I/System.out: The task value is 122
I/System.out: The task value is 123
I/System.out: The task value is 124
I/System.out: The task value is 125
I/System.out: The task value is 126
I/System.out: The task value is 127
I/System.out: The task value is 128
I/System.out: The task value is 129
I/System.out: The task value is 130
I/System.out: The task value is 131
I/System.out: The task value is 132
I/System.out: The task value is 133
I/System.out: The task value is 134
I/System.out: The task value is 135
I/System.out: The task value is 136
I/System.out: The task value is 137
I/System.out: The task value is 138
I/System.out: The task value is 139
I/System.out: The task value is 140
I/System.out: The task value is 141
I/System.out: The task value is 142
I/System.out: The task value is 143
I/System.out: The task value is 144
I/System.out: The task value is 145
I/System.out: The task value is 146
I/System.out: The task value is 147
I/System.out: The task value is 148
I/System.out: The task value is 149
I/System.out: The task value is 150
I/System.out: The task value is 151
I/System.out: The task value is 152
I/System.out: The task value is 153
I/System.out: The task value is 154
I/System.out: The task value is 155
I/System.out: The task value is 156
I/System.out: The task value is 157
I/System.out: The task value is 158
I/System.out: The task value is 159
I/System.out: The task value is 160
I/System.out: The task value is 161
I/System.out: The task value is 162
I/System.out: The task value is 163
I/System.out: The task value is 164
I/System.out: The task value is 165
I/System.out: The task value is 166
I/System.out: The task value is 167
I/System.out: The task value is 168
I/System.out: The task value is 169
I/System.out: The task value is 170
I/System.out: The task value is 171
I/System.out: The task value is 172
I/System.out: The task value is 173
I/System.out: The task value is 174
I/System.out: The task value is 175
I/System.out: The task value is 176
I/System.out: The task value is 177
I/System.out: The task value is 178
I/System.out: The task value is 179
I/System.out: The task value is 180
I/System.out: The task value is 181
I/System.out: The task value is 182
I/System.out: The task value is 183
I/System.out: The task value is 184
I/System.out: The task value is 185
I/System.out: The task value is 186
I/System.out: The task value is 187
I/System.out: The task value is 188
I/System.out: The task value is 189
I/System.out: The task value is 190
I/System.out: The task value is 191
I/System.out: The task value is 192
I/System.out: The task value is 193
I/System.out: The task value is 194
I/System.out: The task value is 195
I/System.out: The task value is 196
I/System.out: The task value is 197
I/System.out: The task value is 198
I/System.out: The task value is 199
I/System.out: The task value is 200
I/System.out: The task value is 201
I/System.out: The task value is 202
I/System.out: The task value is 203
I/System.out: The task value is 204
I/System.out: The task value is 205
I/System.out: The task value is 206
I/System.out: The task value is 207
I/System.out: The task value is 208
I/System.out: The task value is 209
I/System.out: The task value is 210
I/System.out: The task value is 211
I/System.out: The task value is 212
I/System.out: The task value is 213
I/System.out: The task value is 214
I/System.out: The task value is 215
I/System.out: The task value is 216
I/System.out: The task value is 217
I/System.out: The task value is 218
I/System.out: The task value is 219
I/System.out: The task value is 220
I/System.out: The task value is 221
I/System.out: The task value is 222
I/System.out: The task value is 223
I/System.out: The task value is 224
I/System.out: The task value is 225
I/System.out: The task value is 226
I/System.out: The task value is 227
I/System.out: The task value is 228
I/System.out: The task value is 229
I/System.out: The task value is 230
I/System.out: The task value is 231
I/System.out: The task value is 232
I/System.out: The task value is 233
I/System.out: The task value is 234
I/System.out: The task value is 235
I/System.out: The task value is 236
I/System.out: The task value is 237
I/System.out: The task value is 238
I/System.out: The task value is 239
I/System.out: The task value is 240
I/System.out: The task value is 241
I/System.out: The task value is 242
I/System.out: The task value is 243
I/System.out: The task value is 244
I/System.out: The task value is 245
I/System.out: The task value is 246
I/System.out: The task value is 247
I/System.out: The task value is 248
I/System.out: The task value is 249
I/System.out: The task value is 250
I/System.out: The task value is 251
I/System.out: The task value is 252
I/System.out: The task value is 253
I/System.out: The task value is 254
I/System.out: The task value is 255
I/System.out: The task value is 256
I/System.out: The task value is 257
I/System.out: The task value is 258
I/System.out: The task value is 259
I/System.out: The task value is 260
I/System.out: The task value is 261
I/System.out: The task value is 262
I/System.out: The task value is 263
I/System.out: The task value is 264
I/System.out: The task value is 265
I/System.out: The task value is 266
I/System.out: The task value is 267
I/System.out: The task value is 268
I/System.out: The task value is 269
I/System.out: The task value is 270
I/System.out: The task value is 271
I/System.out: The task value is 272
I/System.out: The task value is 273
I/System.out: The task value is 274
I/System.out: The task value is 275
I/System.out: The task value is 276
I/System.out: The task value is 277
I/System.out: The task value is 278
I/System.out: The task value is 279
I/System.out: The task value is 280
I/System.out: The task value is 281
I/System.out: The task value is 282
I/System.out: The task value is 283
I/System.out: The task value is 284
I/System.out: The task value is 285
I/System.out: The task value is 286
I/System.out: The task value is 287
I/System.out: The task value is 288
I/System.out: The task value is 289
I/System.out: The task value is 290
I/System.out: The task value is 291
I/System.out: The task value is 292
I/System.out: The task value is 293
I/System.out: The task value is 294
I/System.out: The task value is 295
I/System.out: The task value is 296
I/System.out: The task value is 297
I/System.out: The task value is 298
I/System.out: The task value is 299
I/System.out: The task value is 300
I/System.out: The task value is 301
I/System.out: The task value is 302
I/System.out: The task value is 303
I/System.out: The task value is 304
I/System.out: The task value is 305
I/System.out: The task value is 306
I/System.out: The task value is 307
I/System.out: The task value is 308
I/System.out: The task value is 309
I/System.out: The task value is 310
I/System.out: The task value is 311
I/System.out: The task value is 312
I/System.out: The task value is 313
I/System.out: The task value is 314
I/System.out: The task value is 315
I/System.out: The task value is 316
I/System.out: The task value is 317
I/System.out: The task value is 318
I/System.out: The task value is 319
I/System.out: The task value is 320
I/System.out: The task value is 321
I/System.out: The task value is 322
I/System.out: The task value is 323
I/System.out: The task value is 324
I/System.out: The task value is 325
I/System.out: The task value is 326
I/System.out: The task value is 327
I/System.out: The task value is 328
I/System.out: The task value is 329
I/System.out: The task value is 330
I/System.out: The task value is 331
I/System.out: The task value is 332
I/System.out: The task value is 333
I/System.out: The task value is 334
I/System.out: The task value is 335
I/System.out: The task value is 336
I/System.out: The task value is 337
I/System.out: The task value is 338
I/System.out: The task value is 339
I/System.out: The task value is 340
I/System.out: The task value is 341
I/System.out: The task value is 342
I/System.out: The task value is 343
I/System.out: The task value is 344
I/System.out: The task value is 345
I/System.out: The task value is 346
I/System.out: The task value is 347
I/System.out: The task value is 348
I/System.out: The task value is 349
I/System.out: The task value is 350
I/System.out: The task value is 351
I/System.out: The task value is 352
I/System.out: The task value is 353
I/System.out: The task value is 354
I/System.out: The task value is 355
I/System.out: The task value is 356
I/System.out: The task value is 357
I/System.out: The task value is 358
I/System.out: The task value is 359
I/System.out: The task value is 360
I/System.out: The task value is 361
I/System.out: The task value is 362
I/System.out: The task value is 363
I/System.out: The task value is 364
I/System.out: The task value is 365
I/System.out: The task value is 366
I/System.out: The task value is 367
I/System.out: The task value is 368
I/System.out: The task value is 369
I/System.out: The task value is 370
I/System.out: The task value is 371
I/System.out: The task value is 372
I/System.out: The task value is 373
I/System.out: The task value is 374
I/System.out: The task value is 375
I/System.out: The task value is 376
I/System.out: The task value is 377
I/System.out: The task value is 378
I/System.out: The task value is 379
I/System.out: The task value is 380
I/System.out: The task value is 381
I/System.out: The task value is 382
I/System.out: The task value is 383
I/System.out: The task value is 384
I/System.out: The task value is 385
I/System.out: The task value is 386
I/System.out: The task value is 387
I/System.out: The task value is 388
I/System.out: The task value is 389
I/System.out: The task value is 390
I/System.out: The task value is 391
I/System.out: The task value is 392
I/System.out: The task value is 393
I/System.out: The task value is 394
I/System.out: The task value is 395
I/System.out: The task value is 396
I/System.out: The task value is 397
I/System.out: The task value is 398
I/System.out: The task value is 399
I/System.out: The task value is 400
I/System.out: The task value is 401
I/System.out: The task value is 402
I/System.out: The task value is 403
I/System.out: The task value is 404
I/System.out: The task value is 405
I/System.out: The task value is 406
I/System.out: The task value is 407
I/System.out: The task value is 408
I/System.out: The task value is 409
I/System.out: The task value is 410
I/System.out: The task value is 411
I/System.out: The task value is 412
I/System.out: The task value is 413
I/System.out: The task value is 414
I/System.out: The task value is 415
I/System.out: The task value is 416
I/System.out: The task value is 417
I/System.out: The task value is 418
I/System.out: The task value is 419
I/System.out: The task value is 420
I/System.out: The task value is 421
I/System.out: The task value is 422
I/System.out: The task value is 423
I/System.out: The task value is 424
I/System.out: The task value is 425
I/System.out: The task value is 426
I/System.out: The task value is 427
I/System.out: The task value is 428
I/System.out: The task value is 429
I/System.out: The task value is 430
I/System.out: The task value is 431
I/System.out: The task value is 432
I/System.out: The task value is 433
I/System.out: The task value is 434
I/System.out: The task value is 435
I/System.out: The task value is 436
I/System.out: The task value is 437
I/System.out: The task value is 438
I/System.out: The task value is 439
I/System.out: The task value is 440
I/System.out: The task value is 441
I/System.out: The task value is 442
I/System.out: The task value is 443
I/System.out: The task value is 444
I/System.out: The task value is 445
I/System.out: The task value is 446
I/System.out: The task value is 447
I/System.out: The task value is 448
I/System.out: The task value is 449
I/System.out: The task value is 450
I/System.out: The task value is 451
I/System.out: The task value is 452
I/System.out: The task value is 453
I/System.out: The task value is 454
I/System.out: The task value is 455
I/System.out: The task value is 456
I/System.out: The task value is 457
I/zygote: Do partial code cache collection, code=30KB, data=26KB
I/zygote: After code cache collection, code=30KB, data=26KB
    Increasing code cache capacity to 128KB
I/System.out: The task value is 458
I/System.out: The task value is 459
I/System.out: The task value is 460
I/System.out: The task value is 461
I/System.out: The task value is 462
I/System.out: The task value is 463
I/System.out: The task value is 464
I/System.out: The task value is 465
I/System.out: The task value is 466
I/System.out: The task value is 467
I/System.out: The task value is 468
I/System.out: The task value is 469
I/System.out: The task value is 470
I/System.out: The task value is 471
I/System.out: The task value is 472
I/System.out: The task value is 473
I/System.out: The task value is 474
I/System.out: The task value is 475
I/System.out: The task value is 476
I/System.out: The task value is 477
I/System.out: The task value is 478
I/System.out: The task value is 479
I/System.out: The task value is 480
I/System.out: The task value is 481
I/System.out: The task value is 482
I/System.out: The task value is 483
I/System.out: The task value is 484
I/System.out: The task value is 485
I/System.out: The task value is 486
I/System.out: The task value is 487
I/System.out: The task value is 488
I/System.out: The task value is 489
I/System.out: The task value is 490
I/System.out: The task value is 491
I/System.out: The task value is 492
I/System.out: The task value is 493
I/System.out: The task value is 494
I/System.out: The task value is 495
I/System.out: The task value is 496
I/System.out: The task value is 497
I/System.out: The task value is 498
I/System.out: The task value is 499
I/System.out: The task value is 500
I/System.out: The task value is 501
I/System.out: The task value is 502
I/System.out: The task value is 503
I/System.out: The task value is 504
I/System.out: The task value is 505
I/System.out: The task value is 506
I/System.out: The task value is 507
I/System.out: The task value is 508
I/System.out: The task value is 509
I/System.out: The task value is 510
I/System.out: The task value is 511
I/System.out: The task value is 512
I/System.out: The task value is 513
I/System.out: The task value is 514
I/System.out: The task value is 515
I/System.out: The task value is 516
I/System.out: The task value is 517
I/System.out: The task value is 518
I/System.out: The task value is 519
I/System.out: The task value is 520
I/System.out: The task value is 521
I/System.out: The task value is 522
I/System.out: The task value is 523
I/System.out: The task value is 524
I/System.out: The task value is 525
I/System.out: The task value is 526
I/System.out: The task value is 527
I/System.out: The task value is 528
I/System.out: The task value is 529
I/System.out: The task value is 530
I/System.out: The task value is 531
I/System.out: The task value is 532
I/System.out: The task value is 533
I/System.out: The task value is 534
I/System.out: The task value is 535
I/System.out: The task value is 536
I/System.out: The task value is 537
I/System.out: The task value is 538
I/System.out: The task value is 539
I/System.out: The task value is 540
I/System.out: The task value is 541
I/System.out: The task value is 542
I/System.out: The task value is 543
I/System.out: The task value is 544
I/System.out: The task value is 545
I/System.out: The task value is 546
I/System.out: The task value is 547
I/System.out: The task value is 548
I/System.out: The task value is 549
I/System.out: The task value is 550
I/System.out: The task value is 551
I/System.out: The task value is 552
I/System.out: The task value is 553
I/System.out: The task value is 554
I/System.out: The task value is 555
I/System.out: The task value is 556
I/System.out: The task value is 557
I/System.out: The task value is 558
I/System.out: The task value is 559
I/System.out: The task value is 560
I/System.out: The task value is 561
I/System.out: The task value is 562
I/System.out: The task value is 563
I/System.out: The task value is 564
I/System.out: The task value is 565
I/System.out: The task value is 566
I/System.out: The task value is 567
I/System.out: The task value is 568
I/System.out: The task value is 569
I/System.out: The task value is 570
I/System.out: The task value is 571
I/System.out: The task value is 572
I/System.out: The task value is 573
I/System.out: The task value is 574
I/System.out: The task value is 575
I/System.out: The task value is 576
I/System.out: The task value is 577
I/System.out: The task value is 578
I/System.out: The task value is 579
I/System.out: The task value is 580
I/System.out: The task value is 581
I/System.out: The task value is 582
I/System.out: The task value is 583
I/System.out: The task value is 584
I/System.out: The task value is 585
I/System.out: The task value is 586
I/System.out: The task value is 587
I/System.out: The task value is 588
I/System.out: The task value is 589
I/System.out: The task value is 590
I/System.out: The task value is 591
I/System.out: The task value is 592
I/System.out: The task value is 593
I/System.out: The task value is 594
I/System.out: The task value is 595
I/System.out: The task value is 596
I/System.out: The task value is 597
I/System.out: The task value is 598
I/System.out: The task value is 599
I/System.out: The task value is 600
I/System.out: The task value is 601
I/System.out: The task value is 602
I/System.out: The task value is 603
I/System.out: The task value is 604
I/System.out: The task value is 605
I/System.out: The task value is 606
I/System.out: The task value is 607
I/System.out: The task value is 608
I/System.out: The task value is 609
I/System.out: The task value is 610
I/System.out: The task value is 611
I/System.out: The task value is 612
I/System.out: The task value is 613
I/System.out: The task value is 614
I/System.out: The task value is 615
I/System.out: The task value is 616
I/System.out: The task value is 617
I/System.out: The task value is 618
I/System.out: The task value is 619
I/System.out: The task value is 620
I/System.out: The task value is 621
I/System.out: The task value is 622
I/System.out: The task value is 623
I/System.out: The task value is 624
I/System.out: The task value is 625
I/System.out: The task value is 626
I/System.out: The task value is 627
I/System.out: The task value is 628
I/System.out: The task value is 629
I/System.out: The task value is 630
I/System.out: The task value is 631
I/System.out: The task value is 632
I/System.out: The task value is 633
I/System.out: The task value is 634
I/System.out: The task value is 635
I/System.out: The task value is 636
I/System.out: The task value is 637
I/System.out: The task value is 638
I/System.out: The task value is 639
I/System.out: The task value is 640
I/System.out: The task value is 641
I/System.out: The task value is 642
I/System.out: The task value is 643
I/System.out: The task value is 644
I/System.out: The task value is 645
I/System.out: The task value is 646
I/System.out: The task value is 647
I/System.out: The task value is 648
I/System.out: The task value is 649
I/System.out: The task value is 650
I/System.out: The task value is 651
I/System.out: The task value is 652
I/System.out: The task value is 653
I/System.out: The task value is 654
I/zygote: Ignoring second debugger -- accepting and dropping
I/System.out: The task value is 655
I/System.out: The task value is 656
I/System.out: The task value is 657
I/System.out: The task value is 658
I/System.out: The task value is 659
I/System.out: The task value is 660
I/System.out: The task value is 661
I/System.out: The task value is 662
I/System.out: The task value is 663
I/System.out: The task value is 664
I/System.out: The task value is 665
I/System.out: The task value is 666
I/System.out: The task value is 667
I/System.out: The task value is 668
I/System.out: The task value is 669
I/System.out: The task value is 670
I/System.out: The task value is 671
I/System.out: The task value is 672
I/System.out: The task value is 673
I/System.out: The task value is 674
I/System.out: The task value is 675
I/System.out: The task value is 676
I/System.out: The task value is 677
I/System.out: The task value is 678
I/System.out: The task value is 679
I/System.out: The task value is 680
I/System.out: The task value is 681
I/System.out: The task value is 682
I/System.out: The task value is 683
I/System.out: The task value is 684
I/System.out: The task value is 685
I/System.out: The task value is 686
I/System.out: The task value is 687
I/System.out: The task value is 688
I/System.out: The task value is 689
I/System.out: The task value is 690
I/System.out: The task value is 691
I/System.out: The task value is 692
I/System.out: The task value is 693
I/System.out: The task value is 694
I/System.out: The task value is 695
I/System.out: The task value is 696
I/System.out: The task value is 697
I/System.out: The task value is 698
I/System.out: The task value is 699
I/System.out: The task value is 700
I/System.out: The task value is 701
I/System.out: The task value is 702
I/System.out: The task value is 703
I/System.out: The task value is 704
I/System.out: The task value is 705
I/System.out: The task value is 706
I/System.out: The task value is 707
I/System.out: The task value is 708
I/System.out: The task value is 709
I/System.out: The task value is 710
I/System.out: The task value is 711
I/System.out: The task value is 712
I/System.out: The task value is 713
I/System.out: The task value is 714
I/System.out: The task value is 715
I/System.out: The task value is 716
I/System.out: The task value is 717
I/System.out: The task value is 718
I/System.out: The task value is 719
I/System.out: The task value is 720
I/System.out: The task value is 721
I/System.out: The task value is 722
I/System.out: The task value is 723
I/System.out: The task value is 724
I/System.out: The task value is 725
I/System.out: The task value is 726
I/System.out: The task value is 727
I/System.out: The task value is 728
I/System.out: The task value is 729
I/System.out: The task value is 730
I/System.out: The task value is 731
I/System.out: The task value is 732
I/System.out: The task value is 733
I/System.out: The task value is 734
I/System.out: The task value is 735
I/System.out: The task value is 736
I/System.out: The task value is 737
I/System.out: The task value is 738
I/System.out: The task value is 739
I/System.out: The task value is 740
I/System.out: The task value is 741
I/System.out: The task value is 742
I/System.out: The task value is 743
I/System.out: The task value is 744
I/System.out: The task value is 745
I/System.out: The task value is 746
I/System.out: The task value is 747
I/System.out: The task value is 748
I/System.out: The task value is 749
I/System.out: The task value is 750
I/System.out: The task value is 751
I/System.out: The task value is 752
I/System.out: The task value is 753
I/System.out: The task value is 754
I/System.out: The task value is 755
I/System.out: The task value is 756
I/System.out: The task value is 757
I/System.out: The task value is 758
I/System.out: The task value is 759
I/System.out: The task value is 760
I/System.out: The task value is 761
I/System.out: The task value is 762
I/System.out: The task value is 763
I/System.out: The task value is 764
I/System.out: The task value is 765
I/System.out: The task value is 766
I/System.out: The task value is 767
I/System.out: The task value is 768
I/System.out: The task value is 769
I/System.out: The task value is 770
I/System.out: The task value is 771
I/System.out: The task value is 772
I/System.out: The task value is 773
I/System.out: The task value is 774
I/System.out: The task value is 775
I/System.out: The task value is 776
I/System.out: The task value is 777
I/System.out: The task value is 778
I/System.out: The task value is 779
I/System.out: The task value is 780
I/System.out: The task value is 781
I/System.out: The task value is 782
I/System.out: The task value is 783
I/System.out: The task value is 784
I/System.out: The task value is 785
I/System.out: The task value is 786
I/System.out: The task value is 787
I/System.out: The task value is 788
I/System.out: The task value is 789
I/System.out: The task value is 790
I/System.out: The task value is 791
I/System.out: The task value is 792
I/System.out: The task value is 793
I/System.out: The task value is 794
I/System.out: The task value is 795
I/System.out: The task value is 796
I/System.out: The task value is 797
I/System.out: The task value is 798
I/System.out: The task value is 799
I/System.out: The task value is 800
I/System.out: The task value is 801
I/System.out: The task value is 802
I/System.out: The task value is 803
I/System.out: The task value is 804
I/System.out: The task value is 805
I/System.out: The task value is 806
I/System.out: The task value is 807
I/System.out: The task value is 808
I/System.out: The task value is 809
I/System.out: The task value is 810
I/System.out: The task value is 811
I/System.out: The task value is 812
I/System.out: The task value is 813
I/System.out: The task value is 814
I/System.out: The task value is 815
I/System.out: The task value is 816
I/System.out: The task value is 817
I/System.out: The task value is 818
I/System.out: The task value is 819
I/System.out: The task value is 820
I/System.out: The task value is 821
I/System.out: The task value is 822
I/System.out: The task value is 823
I/System.out: The task value is 824
I/System.out: The task value is 825
I/System.out: The task value is 826
I/System.out: The task value is 827
I/System.out: The task value is 828
I/System.out: The task value is 829
I/System.out: The task value is 830
I/System.out: The task value is 831
I/System.out: The task value is 832
I/System.out: The task value is 833
I/System.out: The task value is 834
I/System.out: The task value is 835
I/System.out: The task value is 836
I/System.out: The task value is 837
I/System.out: The task value is 838
I/System.out: The task value is 839
I/System.out: The task value is 840
I/System.out: The task value is 841
I/System.out: The task value is 842
I/System.out: The task value is 843
I/System.out: The task value is 844
I/System.out: The task value is 845
I/System.out: The task value is 846
I/System.out: The task value is 847
I/System.out: The task value is 848
I/System.out: The task value is 849
I/System.out: The task value is 850
I/System.out: The task value is 851
I/System.out: The task value is 852
I/System.out: The task value is 853
I/System.out: The task value is 854
I/System.out: The task value is 855
I/System.out: The task value is 856
I/System.out: The task value is 857
I/System.out: The task value is 858
I/System.out: The task value is 859
I/System.out: The task value is 860
I/System.out: The task value is 861
I/System.out: The task value is 862
I/System.out: The task value is 863
I/System.out: The task value is 864
I/System.out: The task value is 865
I/System.out: The task value is 866
I/System.out: The task value is 867
I/System.out: The task value is 868
I/System.out: The task value is 869
I/System.out: The task value is 870
I/System.out: The task value is 871
I/System.out: The task value is 872
I/System.out: The task value is 873
I/System.out: The task value is 874
I/System.out: The task value is 875
I/System.out: The task value is 876
I/System.out: The task value is 877
I/System.out: The task value is 878
I/System.out: The task value is 879
I/System.out: The task value is 880
I/System.out: The task value is 881
I/System.out: The task value is 882
I/System.out: The task value is 883
I/System.out: The task value is 884
I/System.out: The task value is 885
I/System.out: The task value is 886
I/System.out: The task value is 887
I/System.out: The task value is 888
I/System.out: The task value is 889
I/System.out: The task value is 890
I/System.out: The task value is 891
I/System.out: The task value is 892
I/System.out: The task value is 893
I/System.out: The task value is 894
I/System.out: The task value is 895
I/System.out: The task value is 896
I/System.out: The task value is 897
I/System.out: The task value is 898
I/System.out: The task value is 899
I/System.out: The task value is 900
I/System.out: The task value is 901
I/System.out: The task value is 902
I/System.out: The task value is 903
I/System.out: The task value is 904
I/System.out: The task value is 905
I/System.out: The task value is 906
I/System.out: The task value is 907
I/System.out: The task value is 908
I/System.out: The task value is 909
I/System.out: The task value is 910
I/System.out: The task value is 911
I/System.out: The task value is 912
I/System.out: The task value is 913
I/System.out: The task value is 914
I/System.out: The task value is 915
I/System.out: The task value is 916
I/System.out: The task value is 917
I/System.out: The task value is 918
I/System.out: The task value is 919
I/System.out: The task value is 920
I/System.out: The task value is 921
I/System.out: The task value is 922
I/System.out: The task value is 923
I/System.out: The task value is 924
I/System.out: The task value is 925
I/System.out: The task value is 926
I/System.out: The task value is 927
I/System.out: The task value is 928
I/System.out: The task value is 929
I/System.out: The task value is 930
I/System.out: The task value is 931
I/System.out: The task value is 932
I/System.out: The task value is 933
I/System.out: The task value is 934
I/System.out: The task value is 935
I/System.out: The task value is 936
I/System.out: The task value is 937
I/System.out: The task value is 938
I/System.out: The task value is 939
I/System.out: The task value is 940
I/System.out: The task value is 941
I/System.out: The task value is 942
I/System.out: The task value is 943
I/System.out: The task value is 944
I/System.out: The task value is 945
I/System.out: The task value is 946
I/System.out: The task value is 947
I/System.out: The task value is 948
I/System.out: The task value is 949
I/System.out: The task value is 950
I/System.out: The task value is 951
I/System.out: The task value is 952
I/System.out: The task value is 953
I/System.out: The task value is 954
I/System.out: The task value is 955
I/System.out: The task value is 956
I/System.out: The task value is 957
I/System.out: The task value is 958
I/System.out: The task value is 959
I/System.out: The task value is 960
I/System.out: The task value is 961
I/System.out: The task value is 962
I/System.out: The task value is 963
I/System.out: The task value is 964
I/System.out: The task value is 965
I/System.out: The task value is 966
I/System.out: The task value is 967
I/System.out: The task value is 968
I/System.out: The task value is 969
I/System.out: The task value is 970
I/System.out: The task value is 971
I/System.out: The task value is 972
I/System.out: The task value is 973
I/System.out: The task value is 974
I/System.out: The task value is 975
I/System.out: The task value is 976
I/System.out: The task value is 977
I/System.out: The task value is 978
I/System.out: The task value is 979
I/System.out: The task value is 980
I/System.out: The task value is 981
I/System.out: The task value is 982
I/System.out: The task value is 983
I/System.out: The task value is 984
I/System.out: The task value is 985
I/System.out: The task value is 986
I/System.out: The task value is 987
I/System.out: The task value is 988
I/System.out: The task value is 989
I/System.out: The task value is 990
I/System.out: The task value is 991
I/System.out: The task value is 992
I/System.out: The task value is 993
I/System.out: The task value is 994
I/System.out: The task value is 995
I/System.out: The task value is 996
I/System.out: The task value is 997
I/System.out: The task value is 998
I/System.out: The task value is 999
I/zygote: Ignoring second debugger -- accepting and dropping
I/zygote: Ignoring second debugger -- accepting and dropping

 */