            package p000;
            
            public final class II1liI extends Oll0io implements IlliIl1l11O {
                public final int I00iOIl;
                public int I00iiI;
                public final II1o0111IO0 I00iiO;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public II1liI(II1o0111IO0 iI1o0111IO0, IOoil1iiIilo iOoil1iiIilo, int i) {
/* 6 */             super(2, iOoil1iiIilo);
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00iiO = iI1o0111IO0;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             II1o0111IO0 iI1o0111IO0 = this.I00iiO;
                    switch (i) {
                        case 0:
/* 18 */                    return new II1liI(iI1o0111IO0, iOoil1iiIilo, 0);
                        default:
/* 11 */                    return new II1liI(iI1o0111IO0, iOoil1iiIilo, 1);
                    }
                }

                @Override
                public final Object invoke(Object obj, Object obj2) throws Throwable {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 5 */             Ii0110 ii0110 = (Ii0110) obj;
/* 7 */             IOoil1iiIilo iOoil1iiIilo = (IOoil1iiIilo) obj2;
                    switch (i) {
                        case 0:
/* 29 */                    ((II1liI) create(ii0110, iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
/* 32 */                    return Ii0111o.I00iOIl;
                        default:
/* 18 */                    return ((II1liI) create(ii0110, iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                    }
                }

                /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                    jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
                    	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                    	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                    	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                    */
                /* JADX WARN: Removed duplicated region for block: B:33:0x007d  */
                /* JADX WARN: Removed duplicated region for block: B:37:0x008f  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x007b -> B:35:0x007f). Please report as a decompilation issue!!! */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
                    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
                        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                        */
                    /*  JADX ERROR: Method code generation error
                        java.lang.NullPointerException
                        */
                    /*
                        r8 = this;
                        int r0 = r8.I00iOIl
                        java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                        r2 = 1
                        r3 = 0
                        switch(r0) {
                            case 0: goto L60;
                            default: goto L9;
                        }
                    L9:
                        OoiIlOl1iI r0 = p000.OoiIlOl1iI.I00000oIO
                        II1o0111IO0 r4 = r8.I00iiO
                        Ii0111o r5 = p000.Ii0111o.I00iOIl
                        int r6 = r8.I00iiI
                        r7 = 2
                        if (r6 == 0) goto L24
                        if (r6 == r2) goto L20
                        if (r6 != r7) goto L1c
                        p000.lIoii1l01l0i.I00000oOI(r9)
                        goto L5e
                    L1c:
                        p000.I000II.I001IO000(r1)
                        goto L5f
                    L20:
                        p000.lIoii1l01l0i.I00000oOI(r9)
                        goto L42
                    L24:
                        p000.lIoii1l01l0i.I00000oOI(r9)
                        IIOo1i r9 = r4.I0000oI00
                        r8.I00iiI = r2
                        r9.getClass()
                        Il11ooO1o r1 = p000.II1o1O1O1iIi.I00000oIO
                        I1iOI0oo r2 = new I1iOI0oo
                        r6 = 26
                        r2.<init>(r9, r3, r6)
                        java.lang.Object r9 = p000.iOi1II01i0.I0000oI00(r1, r2, r8)
                        if (r9 != r5) goto L3e
                        goto L3f
                    L3e:
                        r9 = r0
                    L3f:
                        if (r9 != r5) goto L42
                        goto L5c
                    L42:
                        O1loO10Ii0I r9 = r4.I0001Ioi1lo
                        r8.I00iiI = r7
                        r9.getClass()
                        Il11ooO1o r1 = p000.II1o1O1O1iIi.I00000oIO
                        I1iOI0oo r2 = new I1iOI0oo
                        r4 = 13
                        r2.<init>(r9, r3, r4)
                        java.lang.Object r8 = p000.iOi1II01i0.I0000oI00(r1, r2, r8)
                        if (r8 != r5) goto L59
                        goto L5a
                    L59:
                        r8 = r0
                    L5a:
                        if (r8 != r5) goto L5e
                    L5c:
                        r3 = r5
                        goto L5f
                    L5e:
                        r3 = r0
                    L5f:
                        return r3
                    L60:
                        Ii0111o r0 = p000.Ii0111o.I00iOIl
                        int r4 = r8.I00iiI
                        if (r4 == 0) goto L70
                        if (r4 != r2) goto L6c
                        p000.lIoii1l01l0i.I00000oOI(r9)
                        goto L7f
                    L6c:
                        p000.I000II.I001IO000(r1)
                        goto L7e
                    L70:
                        p000.lIoii1l01l0i.I00000oOI(r9)
                    L73:
                        r8.I00iiI = r2
                        r3 = 4000(0xfa0, double:1.9763E-320)
                        java.lang.Object r9 = p000.il0l1o1l.I00000oOI(r3, r8)
                        if (r9 != r0) goto L7f
                        r3 = r0
                    L7e:
                        return r3
                    L7f:
                        II1o0111IO0 r9 = r8.I00iiO
                        OlO0OIIl1 r9 = r9.I0000Il00O
                        java.lang.Object r9 = r9.getValue()
                        II1l1O1oi01 r9 = (p000.II1l1O1oi01) r9
                        I1O1ioi1ll0O r9 = r9.I00000oIO
                        I1O1ioi1ll0O r1 = p000.I1O1ioi1ll0O.I00iiI
                        if (r9 != r1) goto L73
                        II1o0111IO0 r9 = r8.I00iiO
                        OlO0OIIl1 r9 = r9.I0000Il00O
                        java.lang.Object r9 = r9.getValue()
                        II1l1O1oi01 r9 = (p000.II1l1O1oi01) r9
                        boolean r9 = r9.I0000oI00
                        if (r9 != 0) goto L73
                        II1o0111IO0 r9 = r8.I00iiO
                        boolean r9 = r9.I000iOII
                        if (r9 != 0) goto L73
                        II1o0111IO0 r9 = r8.I00iiO
                        I01iOOoiOI r1 = new I01iOOoiOI
                        r3 = 28
                        r1.<init>(r3)
                        r9.I000o00OoI0I(r1)
                        goto L73
                    */
                    throw new UnsupportedOperationException("Method not decompiled: p000.II1liI.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }
