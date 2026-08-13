            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.concurrent.CancellationException;
            
            public final class OI0iOI1lIi extends Oll0io implements IlliIl1l11O {
                public Ii01oI01 I00iOIl;
                public IIOIIi10OOl I00iiI;
                public Object I00iiO;
                public IOi10loi I00iio;
                public IoIoOi I00ilI0I1;
                public long I00ilO0;
                public long I00io1l;
                public long I00ioIO;
                public int I00l0I0l0lO1;
                public Object I00l0OO0IO;
                public final IIIoloiiI1 I00li1OI;
                public final IIOIIi10OOl I00ll1;
                public final Long I00lli11;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OI0iOI1lIi(IIIoloiiI1 iIIoloiiI1, IIOIIi10OOl iIOIIi10OOl, Long l, IOoil1iiIilo iOoil1iiIilo) {
/* 8 */             super(2, iOoil1iiIilo);
/* 1 */             this.I00li1OI = iIIoloiiI1;
/* 3 */             this.I00ll1 = iIOIIi10OOl;
/* 5 */             this.I00lli11 = l;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 9 */             OI0iOI1lIi oI0iOI1lIi = new OI0iOI1lIi(this.I00li1OI, this.I00ll1, this.I00lli11, iOoil1iiIilo);
/* 12 */            oI0iOI1lIi.I00l0OO0IO = obj;
/* 89 */            return oI0iOI1lIi;
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
/* 13 */            return ((OI0iOI1lIi) create((OOIoOo0O) obj, (IOoil1iiIilo) obj2)).invokeSuspend(OoiIlOl1iI.I00000oIO);
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Code restructure failed: missing block: B:122:0x0319, code lost:
                
                    if (((p000.OOIoO0IIOO0) r8).I00ilI0I1.I00000oOI(r24, r2) != r7) goto L134;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:132:0x0358, code lost:
                
                    if (((p000.OOIoO0IIOO0) r0).I00ilI0I1.I00000oOI(r24, r3) == r7) goto L133;
                 */
                /* JADX WARN: Path cross not found for [B:39:0x0144, B:42:0x0161], limit reached: 135 */
                /* JADX WARN: Path cross not found for [B:42:0x0161, B:39:0x0144], limit reached: 135 */
                /* JADX WARN: Removed duplicated region for block: B:100:0x0281 A[ADDED_TO_REGION] */
                /* JADX WARN: Removed duplicated region for block: B:104:0x028a A[PHI: r0 r3 r5
                  0x028a: PHI (r0v4 OOIoOo0O) = (r0v19 OOIoOo0O), (r0v20 OOIoOo0O) binds: [B:48:0x0188, B:43:0x0165] A[DONT_GENERATE, DONT_INLINE]
                  0x028a: PHI (r3v12 long) = (r3v26 long), (r3v27 long) binds: [B:48:0x0188, B:43:0x0165] A[DONT_GENERATE, DONT_INLINE]
                  0x028a: PHI (r5v17 Ii01oI01) = (r5v26 Ii01oI01), (r5v27 Ii01oI01) binds: [B:48:0x0188, B:43:0x0165] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:111:0x02be A[PHI: r0 r1 r3
                  0x02be: PHI (r0v29 OOIoOo0O) = (r0v28 OOIoOo0O), (r0v1 OOIoOo0O) binds: [B:109:0x02ba, B:10:0x003d] A[DONT_GENERATE, DONT_INLINE]
                  0x02be: PHI (r1v29 long) = (r1v27 long), (r1v30 long) binds: [B:109:0x02ba, B:10:0x003d] A[DONT_GENERATE, DONT_INLINE]
                  0x02be: PHI (r3v34 Ii01oI01) = (r3v32 Ii01oI01), (r3v37 Ii01oI01) binds: [B:109:0x02ba, B:10:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:113:0x02c2  */
                /* JADX WARN: Removed duplicated region for block: B:126:0x0322  */
                /* JADX WARN: Removed duplicated region for block: B:131:0x033d  */
                /* JADX WARN: Removed duplicated region for block: B:146:0x0252 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:39:0x0144  */
                /* JADX WARN: Removed duplicated region for block: B:42:0x0161 A[PHI: r0 r1 r2 r3 r5
                  0x0161: PHI (r0v20 OOIoOo0O) = (r0v1 OOIoOo0O), (r0v1 OOIoOo0O), (r0v1 OOIoOo0O), (r0v17 OOIoOo0O), (r0v25 OOIoOo0O) binds: [B:38:0x0142, B:40:0x015d, B:27:0x00c8, B:56:0x01b8, B:80:0x0255] A[DONT_GENERATE, DONT_INLINE]
                  0x0161: PHI (r1v23 IIOIIi10OOl) = (r1v3 IIOIIi10OOl), (r1v3 IIOIIi10OOl), (r1v5 IIOIIi10OOl), (r1v19 IIOIIi10OOl), (r1v24 IIOIIi10OOl) binds: [B:38:0x0142, B:40:0x015d, B:27:0x00c8, B:56:0x01b8, B:80:0x0255] A[DONT_GENERATE, DONT_INLINE]
                  0x0161: PHI (r2v8 IIOIIi10OOl) = (r2v0 IIOIIi10OOl), (r2v0 IIOIIi10OOl), (r2v0 IIOIIi10OOl), (r2v5 IIOIIi10OOl), (r2v10 IIOIIi10OOl) binds: [B:38:0x0142, B:40:0x015d, B:27:0x00c8, B:56:0x01b8, B:80:0x0255] A[DONT_GENERATE, DONT_INLINE]
                  0x0161: PHI (r3v27 long) = (r3v3 long), (r3v3 long), (r3v5 long), (r3v24 long), (r3v29 long) binds: [B:38:0x0142, B:40:0x015d, B:27:0x00c8, B:56:0x01b8, B:80:0x0255] A[DONT_GENERATE, DONT_INLINE]
                  0x0161: PHI (r5v27 Ii01oI01) = (r5v7 Ii01oI01), (r5v7 Ii01oI01), (r5v9 Ii01oI01), (r5v23 Ii01oI01), (r5v28 Ii01oI01) binds: [B:38:0x0142, B:40:0x015d, B:27:0x00c8, B:56:0x01b8, B:80:0x0255] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:44:0x0167  */
                /* JADX WARN: Removed duplicated region for block: B:49:0x018a  */
                /* JADX WARN: Removed duplicated region for block: B:55:0x01b2 A[PHI: r0 r1 r2 r3 r5 r11
                  0x01b2: PHI (r0v17 OOIoOo0O) = (r0v1 OOIoOo0O), (r0v18 OOIoOo0O) binds: [B:24:0x00a3, B:53:0x01ae] A[DONT_GENERATE, DONT_INLINE]
                  0x01b2: PHI (r1v19 IIOIIi10OOl) = (r1v8 IIOIIi10OOl), (r1v21 IIOIIi10OOl) binds: [B:24:0x00a3, B:53:0x01ae] A[DONT_GENERATE, DONT_INLINE]
                  0x01b2: PHI (r2v5 IIOIIi10OOl) = (r2v0 IIOIIi10OOl), (r2v6 IIOIIi10OOl) binds: [B:24:0x00a3, B:53:0x01ae] A[DONT_GENERATE, DONT_INLINE]
                  0x01b2: PHI (r3v24 long) = (r3v8 long), (r3v25 long) binds: [B:24:0x00a3, B:53:0x01ae] A[DONT_GENERATE, DONT_INLINE]
                  0x01b2: PHI (r5v23 Ii01oI01) = (r5v12 Ii01oI01), (r5v25 Ii01oI01) binds: [B:24:0x00a3, B:53:0x01ae] A[DONT_GENERATE, DONT_INLINE]
                  0x01b2: PHI (r11v28 java.lang.Object) = (r11v15 java.lang.Object), (r11v34 java.lang.Object) binds: [B:24:0x00a3, B:53:0x01ae] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:58:0x01bb  */
                /* JADX WARN: Removed duplicated region for block: B:65:0x0207  */
                /* JADX WARN: Removed duplicated region for block: B:69:0x0217 A[Catch: all -> 0x0267, TRY_LEAVE, TryCatch #2 {all -> 0x0267, blocks: (B:67:0x0211, B:69:0x0217), top: B:140:0x0211 }] */
                /* JADX WARN: Removed duplicated region for block: B:91:0x026a  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x01b8 -> B:42:0x0161). Please report as a decompilation issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x023a -> B:150:0x023e). Please report as a decompilation issue!!! */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) throws Throwable {
                    long j;
                    Object objI000l1;
                    Ii01oI01 ii01oI01;
                    IIOIIi10OOl iIOIIi10OOl;
                    Object objI00100l0;
                    Object objI00100l02;
                    IIOIIi10OOl iIOIIi10OOl2;
                    Ii01oI01 ii01oI012;
                    IOi10loi iOi10loi;
                    IIIloOl0I1I iIIloOl0I1I;
                    IIIloOl0I1I iIIloOl0I1I2;
                    Object objI0000Il00O;
                    long j2;
                    IIOIIi10OOl iIOIIi10OOl3;
                    IIIloOl0I1I iIIloOl0I1I3;
                    OOIoOo0O oOIoOo0O;
                    IIOIIi10OOl iIOIIi10OOl4;
                    long j3;
                    Ii01oI01 ii01oI013;
                    IOi10loi iOi10loi2;
                    Ii01oI01 ii01oI014;
                    IoIoOi ioIoOi;
                    IoIoOi ioIoOi2;
                    IIOIIi10OOl iIOIIi10OOl5;
                    IIOIIi10OOl iIOIIi10OOl6;
                    IIIloOl0I1I iIIloOl0I1I4;
                    IIIloOl0I1I iIIloOl0I1I5;
                    IIOIIi10OOl iIOIIi10OOl7;
                    Long l;
                    Object objI000l12;
                    long j4;
                    Object objI000iOII;
                    OOIoOo0O oOIoOo0O2;
                    long j5;
                    long j6;
/* 5 */             OOIoOo0O oOIoOo0O3 = (OOIoOo0O) this.I00l0OO0IO;
/* 7 */             Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 9 */             int i = this.I00l0I0l0lO1;
/* 11 */            IIOIIi10OOl iIOIIi10OOl8 = this.I00ll1;
/* 15 */            IoIoOi ioIoOi3 = null;
                    switch (i) {
                        case 0:
/* 224 */                   lIoii1l01l0i.I00000oOI(obj);
/* 229 */                   Ii01oI01 ii01oI015 = new Ii01oI01();
/* 234 */                   ii01oI015.I00000oOI = this.I00li1OI;
/* 241 */                   ii01oI015.I0000Il00O = new III1oo00i1li();
/* 243 */                   VarHandle.storeStoreFence();
/* 246 */                   ii01oI015.I00000oOI();
/* 249 */                   j = ii01oI015.I0000oI00;
/* 255 */                   int length = OI0iiO1i1.I00000oOI.I00iOIl.length;
/* 256 */                   byte[] bArr = iIOIIi10OOl8.I00iOIl;
/* 258 */                   int length2 = bArr.length;
/* 266 */                   IIOIIi10OOl iIOIIi10OOl9 = length == length2 ? IIOIIi10OOl.I00iiO : new IIOIIi10OOl(bArr, length, length2);
/* 274 */                   IiI110i1O iiI110i1O = new IiI110i1O(iIOIIi10OOl9, ii01oI015, (IOoil1iiIilo) null, 26);
/* 277 */                   IOiII1I iOiII1I = IIOIli1iili.I00000oIO;
/* 287 */                   IIIloOl0I1I iIIloOl0I1I6 = (IIIloOl0I1I) IIOIli1iili.I00000oOI(oOIoOo0O3, Il00o11.I00iOIl, iiI110i1O).I00iiI;
/* 289 */                   this.I00l0OO0IO = oOIoOo0O3;
/* 291 */                   this.I00iOIl = ii01oI015;
/* 293 */                   this.I00iiI = iIOIIi10OOl9;
/* 295 */                   this.I00ilO0 = j;
/* 298 */                   this.I00l0I0l0lO1 = 1;
/* 300 */                   objI000l1 = iOiOOIlI1o01.I000l1(iIIloOl0I1I6, this);
/* 304 */                   if (objI000l1 != ii0111o) {
/* 308 */                       IIOIIi10OOl iIOIIi10OOl10 = iIOIIi10OOl9;
/* 310 */                       ii01oI01 = ii01oI015;
/* 311 */                       iIOIIi10OOl = iIOIIi10OOl10;
/* 323 */                       if (((OlI1iil1l0) objI000l1).I0000oI00().I00iiO > 0) {
/* 327 */                           OI0iO0Il1oO0 oI0iO0Il1oO0 = new OI0iO0Il1oO0();
/* 330 */                           this.I00l0OO0IO = oOIoOo0O3;
/* 332 */                           this.I00iOIl = ii01oI01;
/* 334 */                           this.I00iiI = iIOIIi10OOl;
/* 336 */                           this.I00ilO0 = j;
/* 339 */                           this.I00l0I0l0lO1 = 2;
/* 350 */                           if (((OOIoO0IIOO0) oOIoOo0O3).I00ilI0I1.I00000oOI(this, oI0iO0Il1oO0) != ii0111o) {
                                    }
                                }
/* 358 */                       if (ii01oI01.I000O01llI0()) {
/* 360 */                           IIOIIi10OOl iIOIIi10OOl11 = OI0iiO1i1.I00000oOI;
/* 362 */                           this.I00l0OO0IO = oOIoOo0O3;
/* 364 */                           this.I00iOIl = ii01oI01;
/* 366 */                           this.I00iiI = iIOIIi10OOl;
/* 368 */                           this.I00iiO = null;
/* 370 */                           this.I00iio = null;
/* 372 */                           this.I00ilI0I1 = null;
/* 374 */                           this.I00ilO0 = j;
/* 377 */                           this.I00l0I0l0lO1 = 3;
/* 379 */                           objI00100l0 = iOiOOIlI1o01.I00100l0(ii01oI01, iIOIIi10OOl11, this);
/* 383 */                           if (objI00100l0 != ii0111o) {
/* 393 */                               if (((Boolean) objI00100l0).booleanValue()) {
/* 395 */                                   IIOIIi10OOl iIOIIi10OOl12 = OI0iiO1i1.I00000oIO;
/* 397 */                                   this.I00l0OO0IO = oOIoOo0O3;
/* 399 */                                   this.I00iOIl = ii01oI01;
/* 401 */                                   this.I00iiI = iIOIIi10OOl;
/* 403 */                                   this.I00ilO0 = j;
/* 406 */                                   this.I00l0I0l0lO1 = 4;
/* 412 */                                   if (iOiOOIlI1o01.I00100l0(ii01oI01, iIOIIi10OOl12, this) != ii0111o) {
/* 416 */                                       this.I00l0OO0IO = oOIoOo0O3;
/* 418 */                                       this.I00iOIl = ii01oI01;
/* 420 */                                       this.I00iiI = iIOIIi10OOl;
/* 422 */                                       this.I00ilO0 = j;
/* 425 */                                       this.I00l0I0l0lO1 = 5;
/* 427 */                                       objI00100l02 = iOiOOIlI1o01.I00100l0(ii01oI01, iIOIIi10OOl, this);
/* 431 */                                       if (objI00100l02 != ii0111o) {
/* 441 */                                           if (((Boolean) objI00100l02).booleanValue()) {
/* 446 */                                               IIIloOl0I1I iIIloOl0I1I7 = new IIIloOl0I1I();
/* 451 */                                               IOi10loi iOi10loi3 = new IOi10loi();
/* 456 */                                               OI0iO0Il1oO0 oI0iO0Il1oO02 = new OI0iO0Il1oO0();
/* 459 */                                               this.I00l0OO0IO = oOIoOo0O3;
/* 461 */                                               this.I00iOIl = ii01oI01;
/* 463 */                                               this.I00iiI = iIOIIi10OOl;
/* 465 */                                               this.I00iiO = iIIloOl0I1I7;
/* 467 */                                               this.I00iio = iOi10loi3;
/* 469 */                                               this.I00ilO0 = j;
/* 472 */                                               this.I00l0I0l0lO1 = 6;
/* 483 */                                               if (((OOIoO0IIOO0) oOIoOo0O3).I00ilI0I1.I00000oOI(this, oI0iO0Il1oO02) != ii0111o) {
/* 489 */                                                   iIOIIi10OOl2 = iIOIIi10OOl;
/* 490 */                                                   iIIloOl0I1I = iIIloOl0I1I7;
/* 494 */                                                   ii01oI012 = ii01oI01;
/* 495 */                                                   iOi10loi = iOi10loi3;
                                                            try {
/* 497 */                                                       this.I00l0OO0IO = oOIoOo0O3;
/* 499 */                                                       this.I00iOIl = ii01oI012;
/* 501 */                                                       this.I00iiI = iIOIIi10OOl2;
/* 503 */                                                       this.I00iiO = iIIloOl0I1I;
/* 505 */                                                       this.I00iio = iOi10loi;
/* 507 */                                                       this.I00ilO0 = j;
/* 510 */                                                       this.I00l0I0l0lO1 = 7;
/* 512 */                                                       objI0000Il00O = OI0iiO1i1.I0000Il00O(ii01oI012, this);
                                                            } catch (Throwable th) {
/* 634 */                                                       th = th;
/* 635 */                                                       iIIloOl0I1I2 = iIIloOl0I1I;
                                                            }
/* 516 */                                                   if (objI0000Il00O != ii0111o) {
                                                                try {
                                                                    try {
/* 520 */                                                               IIOIIi10OOl iIOIIi10OOl13 = iIOIIi10OOl2;
/* 521 */                                                               oOIoOo0O = oOIoOo0O3;
/* 522 */                                                               iIOIIi10OOl4 = iIOIIi10OOl13;
/* 523 */                                                               j2 = j;
/* 524 */                                                               iIOIIi10OOl3 = iIOIIi10OOl8;
/* 525 */                                                               iIIloOl0I1I3 = iIIloOl0I1I;
/* 534 */                                                               if (iOi10loi2.I00O10llo(ioIoOi)) {
/* 619 */                                                                   ioIoOi2 = ioIoOi;
/* 620 */                                                                   ioIoOi2.I0000O();
/* 630 */                                                                   throw new CancellationException("Multipart processing has been cancelled");
                                                                        }
                                                                        try {
/* 536 */                                                                   this.I00l0OO0IO = oOIoOo0O;
/* 538 */                                                                   this.I00iOIl = ii01oI014;
/* 540 */                                                                   this.I00iiI = iIOIIi10OOl4;
/* 542 */                                                                   this.I00iiO = iIIloOl0I1I3;
/* 544 */                                                                   this.I00iio = iOi10loi2;
/* 546 */                                                                   this.I00ilI0I1 = ioIoOi;
/* 548 */                                                                   this.I00ilO0 = j2;
/* 552 */                                                                   this.I00l0I0l0lO1 = 8;
/* 567 */                                                                   if (OI0iiO1i1.I00000oOI(iIOIIi10OOl6, ii01oI014, iIIloOl0I1I3, ioIoOi2, 65536L, this) != ii0111o) {
/* 571 */                                                                       ii01oI01 = ii01oI014;
/* 572 */                                                                       iIIloOl0I1I4 = iIIloOl0I1I3;
/* 574 */                                                                       iIOIIi10OOl = iIOIIi10OOl5;
                                                                                try {
/* 575 */                                                                           iIIloOl0I1I4.I000OOo1O();
/* 590 */                                                                           iIIloOl0I1I5 = iIIloOl0I1I4;
/* 592 */                                                                           if (I1Ioolli0l0o.I00000oIO.compareAndSwapObject(iIIloOl0I1I4, IIIloOl0I1I.I0001Ioi1lo, (Object) null, i1O01I0iIiiI.I00000oIO)) {
                                                                                        try {
/* 595 */                                                                                   iIIloOl0I1I5.I00000oIO(null);
                                                                                        } catch (Throwable th2) {
/* 603 */                                                                                   th = th2;
/* 608 */                                                                                   ioIoOi3 = ioIoOi2;
/* 609 */                                                                                   iIIloOl0I1I2 = iIIloOl0I1I5;
/* 610 */                                                                                   iOi10loi = iOi10loi2;
/* 640 */                                                                                   if (iOi10loi.I00iIO(th)) {
                                                                                            }
/* 647 */                                                                                   IIOIli1iili.I00000oIO(iIIloOl0I1I2, th);
/* 650 */                                                                                   throw th;
                                                                                        }
                                                                                    }
/* 598 */                                                                           iIOIIi10OOl8 = iIOIIi10OOl6;
/* 599 */                                                                           oOIoOo0O3 = oOIoOo0O;
/* 600 */                                                                           j = j2;
/* 358 */                                                                           if (ii01oI01.I000O01llI0()) {
                                                                                    }
                                                                                } catch (Throwable th3) {
/* 605 */                                                                           th = th3;
/* 606 */                                                                           iIIloOl0I1I5 = iIIloOl0I1I4;
                                                                                }
                                                                            }
                                                                        } catch (Throwable th4) {
/* 612 */                                                                   th = th4;
                                                                        }
/* 559 */                                                               iIOIIi10OOl5 = iIOIIi10OOl4;
/* 560 */                                                               iIOIIi10OOl6 = iIOIIi10OOl3;
/* 561 */                                                               ioIoOi2 = ioIoOi;
/* 612 */                                                               th = th4;
                                                                    } catch (Throwable th5) {
/* 631 */                                                               th = th5;
/* 632 */                                                               iIIloOl0I1I2 = iIIloOl0I1I3;
                                                                    }
/* 135 */                                                           ii01oI014 = ii01oI012;
/* 136 */                                                           iOi10loi2 = iOi10loi;
                                                                } catch (Throwable th6) {
/* 616 */                                                           th = th6;
/* 617 */                                                           ioIoOi2 = ioIoOi;
                                                                }
/* 528 */                                                       ioIoOi = (IoIoOi) objI0000Il00O;
/* 613 */                                                       iIIloOl0I1I2 = iIIloOl0I1I3;
/* 614 */                                                       ioIoOi3 = ioIoOi2;
/* 610 */                                                       iOi10loi = iOi10loi2;
/* 640 */                                                       if (iOi10loi.I00iIO(th) && ioIoOi3 != null) {
/* 644 */                                                           ioIoOi3.I0000O();
                                                                }
/* 647 */                                                       IIOIli1iili.I00000oIO(iIIloOl0I1I2, th);
/* 650 */                                                       throw th;
                                                            }
                                                        }
                                                    } else if (ii01oI01.I000O01llI0()) {
/* 651 */                                               j3 = j;
/* 652 */                                               IIOIIi10OOl iIOIIi10OOl14 = OI0iiO1i1.I00000oIO;
/* 654 */                                               this.I00l0OO0IO = oOIoOo0O3;
/* 656 */                                               this.I00iOIl = ii01oI01;
/* 658 */                                               this.I00iiI = null;
/* 660 */                                               this.I00iiO = null;
/* 662 */                                               this.I00iio = null;
/* 664 */                                               this.I00ilI0I1 = null;
/* 666 */                                               this.I00ilO0 = j3;
/* 670 */                                               this.I00l0I0l0lO1 = 9;
/* 676 */                                               if (iOiOOIlI1o01.I00100l0(ii01oI01, iIOIIi10OOl14, this) != ii0111o) {
/* 680 */                                                   ii01oI013 = ii01oI01;
/* 681 */                                                   iIOIIi10OOl7 = OI0iiO1i1.I00000oIO;
/* 683 */                                                   this.I00l0OO0IO = oOIoOo0O3;
/* 685 */                                                   this.I00iOIl = ii01oI013;
/* 687 */                                                   this.I00iiI = null;
/* 689 */                                                   this.I00ilO0 = j3;
/* 693 */                                                   this.I00l0I0l0lO1 = 10;
/* 699 */                                                   if (iOiOOIlI1o01.I00100l0(ii01oI013, iIOIIi10OOl7, this) != ii0111o) {
/* 703 */                                                       l = this.I00lli11;
/* 705 */                                                       if (l == null) {
/* 707 */                                                           ii01oI013.I00000oOI();
/* 712 */                                                           j4 = ii01oI013.I0000oI00 - j3;
/* 717 */                                                           long jLongValue = l.longValue() - j4;
/* 723 */                                                           if (jLongValue > 2147483647L) {
/* 799 */                                                               IioIoO10iOiI.I000OOo1O("Failed to parse multipart: prologue is too long");
/* 15 */                                                                return null;
                                                                    }
/* 727 */                                                           if (jLongValue > 0) {
/* 730 */                                                               this.I00l0OO0IO = null;
/* 732 */                                                               this.I00iOIl = null;
/* 734 */                                                               this.I00iiI = null;
/* 736 */                                                               this.I00iiO = oOIoOo0O3;
/* 738 */                                                               this.I00ilO0 = j3;
/* 740 */                                                               this.I00io1l = j4;
/* 742 */                                                               this.I00ioIO = jLongValue;
/* 746 */                                                               this.I00l0I0l0lO1 = 11;
/* 748 */                                                               objI000iOII = iOiOOIlI1o01.I000iOII(ii01oI013, (int) jLongValue, this);
/* 752 */                                                               if (objI000iOII != ii0111o) {
/* 755 */                                                                   oOIoOo0O2 = oOIoOo0O3;
/* 758 */                                                                   j5 = j3;
/* 759 */                                                                   j6 = jLongValue;
/* 765 */                                                                   OI0iO0Il1oO0 oI0iO0Il1oO03 = new OI0iO0Il1oO0();
/* 768 */                                                                   this.I00l0OO0IO = null;
/* 770 */                                                                   this.I00iOIl = null;
/* 772 */                                                                   this.I00iiI = null;
/* 774 */                                                                   this.I00iiO = null;
/* 776 */                                                                   this.I00ilO0 = j5;
/* 778 */                                                                   this.I00io1l = j4;
/* 780 */                                                                   this.I00ioIO = j6;
/* 784 */                                                                   this.I00l0I0l0lO1 = 12;
                                                                            break;
                                                                        }
                                                                    }
/* 860 */                                                           return OoiIlOl1iI.I00000oIO;
                                                                }
/* 803 */                                                       this.I00l0OO0IO = oOIoOo0O3;
/* 805 */                                                       this.I00iOIl = null;
/* 807 */                                                       this.I00iiI = null;
/* 809 */                                                       this.I00ilO0 = j3;
/* 813 */                                                       this.I00l0I0l0lO1 = 13;
/* 815 */                                                       objI000l12 = iOiOOIlI1o01.I000l1(ii01oI013, this);
/* 819 */                                                       if (objI000l12 != ii0111o) {
/* 828 */                                                           if (!((OlI1iil1l0) objI000l12).I00II0Ol1O0l()) {
/* 832 */                                                               OI0iO0Il1oO0 oI0iO0Il1oO04 = new OI0iO0Il1oO0();
/* 835 */                                                               this.I00l0OO0IO = null;
/* 837 */                                                               this.I00iOIl = null;
/* 839 */                                                               this.I00iiI = null;
/* 841 */                                                               this.I00iiO = null;
/* 843 */                                                               this.I00ilO0 = j3;
/* 847 */                                                               this.I00l0I0l0lO1 = 14;
                                                                        break;
                                                                    }
/* 860 */                                                           return OoiIlOl1iI.I00000oIO;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
/* 859 */                   return ii0111o;
                        case 1:
/* 212 */                   j = this.I00ilO0;
/* 214 */                   iIOIIi10OOl = this.I00iiI;
/* 216 */                   ii01oI01 = this.I00iOIl;
/* 218 */                   lIoii1l01l0i.I00000oOI(obj);
/* 221 */                   objI000l1 = obj;
/* 323 */                   if (((OlI1iil1l0) objI000l1).I0000oI00().I00iiO > 0) {
                            }
/* 358 */                   if (ii01oI01.I000O01llI0()) {
                            }
/* 859 */                   return ii0111o;
                        case 2:
/* 201 */                   j = this.I00ilO0;
/* 203 */                   iIOIIi10OOl = this.I00iiI;
/* 205 */                   ii01oI01 = this.I00iOIl;
/* 207 */                   lIoii1l01l0i.I00000oOI(obj);
/* 358 */                   if (ii01oI01.I000O01llI0()) {
                            }
/* 859 */                   return ii0111o;
                        case 3:
/* 188 */                   j = this.I00ilO0;
/* 190 */                   iIOIIi10OOl = this.I00iiI;
/* 192 */                   ii01oI01 = this.I00iOIl;
/* 194 */                   lIoii1l01l0i.I00000oOI(obj);
/* 197 */                   objI00100l0 = obj;
/* 393 */                   if (((Boolean) objI00100l0).booleanValue()) {
                            }
/* 859 */                   return ii0111o;
                        case 4:
/* 177 */                   j = this.I00ilO0;
/* 179 */                   iIOIIi10OOl = this.I00iiI;
/* 181 */                   ii01oI01 = this.I00iOIl;
/* 183 */                   lIoii1l01l0i.I00000oOI(obj);
/* 416 */                   this.I00l0OO0IO = oOIoOo0O3;
/* 418 */                   this.I00iOIl = ii01oI01;
/* 420 */                   this.I00iiI = iIOIIi10OOl;
/* 422 */                   this.I00ilO0 = j;
/* 425 */                   this.I00l0I0l0lO1 = 5;
/* 427 */                   objI00100l02 = iOiOOIlI1o01.I00100l0(ii01oI01, iIOIIi10OOl, this);
/* 431 */                   if (objI00100l02 != ii0111o) {
                            }
/* 859 */                   return ii0111o;
                        case 5:
/* 164 */                   j = this.I00ilO0;
/* 166 */                   iIOIIi10OOl = this.I00iiI;
/* 168 */                   ii01oI01 = this.I00iOIl;
/* 170 */                   lIoii1l01l0i.I00000oOI(obj);
/* 173 */                   objI00100l02 = obj;
/* 441 */                   if (((Boolean) objI00100l02).booleanValue()) {
                            }
/* 859 */                   return ii0111o;
                        case 6:
/* 142 */                   j = this.I00ilO0;
/* 144 */                   IOi10loi iOi10loi4 = this.I00iio;
/* 148 */                   IIIloOl0I1I iIIloOl0I1I8 = (IIIloOl0I1I) this.I00iiO;
/* 150 */                   iIOIIi10OOl2 = this.I00iiI;
/* 152 */                   ii01oI012 = this.I00iOIl;
/* 154 */                   lIoii1l01l0i.I00000oOI(obj);
/* 159 */                   iOi10loi = iOi10loi4;
/* 160 */                   iIIloOl0I1I = iIIloOl0I1I8;
/* 497 */                   this.I00l0OO0IO = oOIoOo0O3;
/* 499 */                   this.I00iOIl = ii01oI012;
/* 501 */                   this.I00iiI = iIOIIi10OOl2;
/* 503 */                   this.I00iiO = iIIloOl0I1I;
/* 505 */                   this.I00iio = iOi10loi;
/* 507 */                   this.I00ilO0 = j;
/* 510 */                   this.I00l0I0l0lO1 = 7;
/* 512 */                   objI0000Il00O = OI0iiO1i1.I0000Il00O(ii01oI012, this);
/* 516 */                   if (objI0000Il00O != ii0111o) {
                            }
/* 859 */                   return ii0111o;
                        case 7:
/* 112 */                   long j7 = this.I00ilO0;
/* 114 */                   iOi10loi = this.I00iio;
/* 119 */                   iIIloOl0I1I2 = (IIIloOl0I1I) this.I00iiO;
/* 121 */                   IIOIIi10OOl iIOIIi10OOl15 = this.I00iiI;
/* 123 */                   ii01oI012 = this.I00iOIl;
                            try {
/* 125 */                       lIoii1l01l0i.I00000oOI(obj);
/* 128 */                       objI0000Il00O = obj;
/* 130 */                       j2 = j7;
/* 131 */                       iIOIIi10OOl3 = iIOIIi10OOl8;
/* 132 */                       iIIloOl0I1I3 = iIIloOl0I1I2;
/* 133 */                       oOIoOo0O = oOIoOo0O3;
/* 134 */                       iIOIIi10OOl4 = iIOIIi10OOl15;
/* 135 */                       ii01oI014 = ii01oI012;
/* 136 */                       iOi10loi2 = iOi10loi;
/* 528 */                       ioIoOi = (IoIoOi) objI0000Il00O;
/* 534 */                       if (iOi10loi2.I00O10llo(ioIoOi)) {
                                }
/* 612 */                       th = th4;
/* 613 */                       iIIloOl0I1I2 = iIIloOl0I1I3;
/* 614 */                       ioIoOi3 = ioIoOi2;
                            } catch (Throwable th7) {
/* 139 */                       th = th7;
                            }
/* 610 */                   iOi10loi = iOi10loi2;
/* 640 */                   if (iOi10loi.I00iIO(th)) {
/* 644 */                       ioIoOi3.I0000O();
                            }
/* 647 */                   IIOIli1iili.I00000oIO(iIIloOl0I1I2, th);
/* 650 */                   throw th;
                        case 8:
/* 80 */                    long j8 = this.I00ilO0;
/* 82 */                    IoIoOi ioIoOi4 = this.I00ilI0I1;
/* 84 */                    iOi10loi = this.I00iio;
/* 88 */                    iIIloOl0I1I2 = (IIIloOl0I1I) this.I00iiO;
/* 90 */                    IIOIIi10OOl iIOIIi10OOl16 = this.I00iiI;
/* 92 */                    Ii01oI01 ii01oI016 = this.I00iOIl;
                            try {
/* 94 */                        lIoii1l01l0i.I00000oOI(obj);
/* 97 */                        j2 = j8;
/* 98 */                        iIIloOl0I1I4 = iIIloOl0I1I2;
/* 100 */                       oOIoOo0O = oOIoOo0O3;
/* 101 */                       ioIoOi2 = ioIoOi4;
/* 102 */                       iIOIIi10OOl6 = iIOIIi10OOl8;
/* 103 */                       iIOIIi10OOl = iIOIIi10OOl16;
/* 104 */                       iOi10loi2 = iOi10loi;
/* 105 */                       ii01oI01 = ii01oI016;
/* 575 */                       iIIloOl0I1I4.I000OOo1O();
/* 590 */                       iIIloOl0I1I5 = iIIloOl0I1I4;
/* 592 */                       if (I1Ioolli0l0o.I00000oIO.compareAndSwapObject(iIIloOl0I1I4, IIIloOl0I1I.I0001Ioi1lo, (Object) null, i1O01I0iIiiI.I00000oIO)) {
                                }
/* 598 */                       iIOIIi10OOl8 = iIOIIi10OOl6;
/* 599 */                       oOIoOo0O3 = oOIoOo0O;
/* 600 */                       j = j2;
/* 358 */                       if (ii01oI01.I000O01llI0()) {
                                }
/* 859 */                       return ii0111o;
                            } catch (Throwable th8) {
/* 108 */                       th = th8;
/* 109 */                       ioIoOi3 = ioIoOi4;
                                break;
                            }
                            break;
                        case 9:
/* 71 */                    j3 = this.I00ilO0;
/* 73 */                    ii01oI013 = this.I00iOIl;
/* 75 */                    lIoii1l01l0i.I00000oOI(obj);
/* 681 */                   iIOIIi10OOl7 = OI0iiO1i1.I00000oIO;
/* 683 */                   this.I00l0OO0IO = oOIoOo0O3;
/* 685 */                   this.I00iOIl = ii01oI013;
/* 687 */                   this.I00iiI = null;
/* 689 */                   this.I00ilO0 = j3;
/* 693 */                   this.I00l0I0l0lO1 = 10;
/* 699 */                   if (iOiOOIlI1o01.I00100l0(ii01oI013, iIOIIi10OOl7, this) != ii0111o) {
                            }
/* 859 */                   return ii0111o;
                        case 10:
/* 62 */                    j3 = this.I00ilO0;
/* 64 */                    ii01oI013 = this.I00iOIl;
/* 66 */                    lIoii1l01l0i.I00000oOI(obj);
/* 703 */                   l = this.I00lli11;
/* 705 */                   if (l == null) {
                            }
/* 859 */                   return ii0111o;
                        case 11:
/* 44 */                    j6 = this.I00ioIO;
/* 46 */                    long j9 = this.I00io1l;
/* 48 */                    j5 = this.I00ilO0;
/* 52 */                    oOIoOo0O2 = (OOIoOo0O) this.I00iiO;
/* 54 */                    lIoii1l01l0i.I00000oOI(obj);
/* 57 */                    j4 = j9;
/* 58 */                    objI000iOII = obj;
/* 765 */                   OI0iO0Il1oO0 oI0iO0Il1oO032 = new OI0iO0Il1oO0();
/* 768 */                   this.I00l0OO0IO = null;
/* 770 */                   this.I00iOIl = null;
/* 772 */                   this.I00iiI = null;
/* 774 */                   this.I00iiO = null;
/* 776 */                   this.I00ilO0 = j5;
/* 778 */                   this.I00io1l = j4;
/* 780 */                   this.I00ioIO = j6;
/* 784 */                   this.I00l0I0l0lO1 = 12;
                            break;
                        case 12:
/* 39 */                    lIoii1l01l0i.I00000oOI(obj);
/* 860 */                   return OoiIlOl1iI.I00000oIO;
                        case 13:
/* 30 */                    j3 = this.I00ilO0;
/* 32 */                    lIoii1l01l0i.I00000oOI(obj);
/* 35 */                    objI000l12 = obj;
/* 828 */                   if (!((OlI1iil1l0) objI000l12).I00II0Ol1O0l()) {
                            }
/* 860 */                   return OoiIlOl1iI.I00000oIO;
                        case 14:
/* 39 */                    lIoii1l01l0i.I00000oOI(obj);
/* 860 */                   return OoiIlOl1iI.I00000oIO;
                        default:
/* 21 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 15 */                    return null;
                    }
                }
            }
