            package p000;
            
/* 11 */    public final class OiiilII extends Oi10IOIi implements IlliIl1l11O {
                public final int I00iiI = 0;
                public long I00iiO;
                public int I00iio;
                public Object I00ilI0I1;
                public final Object I00ilO0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OiiilII(long j, OOo0o0oO oOo0o0oO, IOoil1iiIilo iOoil1iiIilo) {
/* 9 */             super(2, iOoil1iiIilo);
/* 4 */             this.I00iiO = j;
/* 6 */             this.I00ilO0 = oOo0o0oO;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 1 */             int i = this.I00iiI;
/* 3 */             Object obj2 = this.I00ilO0;
                    switch (i) {
                        case 0:
/* 24 */                    OiiilII oiiilII = new OiiilII(this.I00iiO, (OOo0o0oO) obj2, iOoil1iiIilo);
/* 27 */                    oiiilII.I00ilI0I1 = obj;
/* 29 */                    return oiiilII;
                        default:
/* 12 */                    OiiilII oiiilII2 = new OiiilII((OO1il00lI) obj2, iOoil1iiIilo);
/* 15 */                    oiiilII2.I00ilI0I1 = obj;
/* 17 */                    return oiiilII2;
                    }
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
/* 1 */             int i = this.I00iiI;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 5 */             Oll11lOlo oll11lOlo = (Oll11lOlo) obj;
/* 7 */             IOoil1iiIilo iOoil1iiIilo = (IOoil1iiIilo) obj2;
                    switch (i) {
                    }
/* 18 */            return ((OiiilII) create(oll11lOlo, iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                }

                /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                    jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
                    	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                    	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                    	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                    */
                /* JADX WARN: Removed duplicated region for block: B:12:0x0045  */
                /* JADX WARN: Removed duplicated region for block: B:15:0x004f  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0043 -> B:13:0x0047). Please report as a decompilation issue!!! */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r9) {
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
                        int r0 = r8.I00iiI
                        java.lang.Object r1 = r8.I00ilO0
                        r2 = 0
                        java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
                        r4 = 1
                        switch(r0) {
                            case 0: goto L51;
                            default: goto Lb;
                        }
                    Lb:
                        Ii0111o r0 = p000.Ii0111o.I00iOIl
                        int r5 = r8.I00iio
                        if (r5 == 0) goto L21
                        if (r5 != r4) goto L1d
                        long r1 = r8.I00iiO
                        java.lang.Object r3 = r8.I00ilI0I1
                        Oll11lOlo r3 = (p000.Oll11lOlo) r3
                        p000.lIoii1l01l0i.I00000oOI(r9)
                        goto L47
                    L1d:
                        p000.I000II.I001IO000(r3)
                        goto L50
                    L21:
                        p000.lIoii1l01l0i.I00000oOI(r9)
                        java.lang.Object r9 = r8.I00ilI0I1
                        Oll11lOlo r9 = (p000.Oll11lOlo) r9
                        OO1il00lI r1 = (p000.OO1il00lI) r1
                        long r1 = r1.I00000oOI
                        Oooii1o1 r3 = r9.I0001Ioi1lo()
                        r3.getClass()
                        r5 = 40
                        long r5 = r5 + r1
                        r3 = r9
                        r1 = r5
                    L38:
                        r8.I00ilI0I1 = r3
                        r8.I00iiO = r1
                        r8.I00iio = r4
                        r9 = 3
                        java.lang.Object r9 = p000.OloI0l1i1oO.I00000oOI(r3, r8, r9)
                        if (r9 != r0) goto L47
                        r2 = r0
                        goto L50
                    L47:
                        OO1il00lI r9 = (p000.OO1il00lI) r9
                        long r5 = r9.I00000oOI
                        int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
                        if (r5 < 0) goto L38
                        r2 = r9
                    L50:
                        return r2
                    L51:
                        OOo0o0oO r1 = (p000.OOo0o0oO) r1
                        Ii0111o r0 = p000.Ii0111o.I00iOIl
                        int r5 = r8.I00iio
                        if (r5 == 0) goto L67
                        if (r5 != r4) goto L63
                        java.lang.Object r8 = r8.I00ilI0I1
                        Oll11lOlo r8 = (p000.Oll11lOlo) r8
                        p000.lIoii1l01l0i.I00000oOI(r9)
                        goto L8b
                    L63:
                        p000.I000II.I001IO000(r3)
                        goto Lbd
                    L67:
                        p000.lIoii1l01l0i.I00000oOI(r9)
                        java.lang.Object r9 = r8.I00ilI0I1
                        Oll11lOlo r9 = (p000.Oll11lOlo) r9
                        long r2 = r8.I00iiO
                        O1IIii r5 = new O1IIii
                        r6 = 21
                        r5.<init>(r6)
                        r5.I00iiI = r1
                        java.lang.invoke.VarHandle.storeStoreFence()
                        r8.I00ilI0I1 = r9
                        r8.I00iio = r4
                        java.lang.Object r8 = p000.IilOo0l01l.I0000oI00(r9, r2, r5, r8)
                        if (r8 != r0) goto L88
                        r2 = r0
                        goto Lbd
                    L88:
                        r7 = r9
                        r9 = r8
                        r8 = r7
                    L8b:
                        OO1il00lI r9 = (p000.OO1il00lI) r9
                        if (r9 == 0) goto La3
                        long r0 = r1.I00iOIl
                        r2 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
                        long r0 = r0 & r2
                        r2 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
                        int r9 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                        if (r9 == 0) goto La3
                        Iiioii1il r2 = p000.Iiioii1il.I00iiI
                        goto Lbd
                    La3:
                        Oll1OII0o r8 = r8.I00ilO0
                        OO1Oooio101 r8 = r8.I00oII
                        java.util.List r8 = r8.I00000oIO
                        java.lang.Object r8 = p000.IOOi0Ool1i.I001lllioOl(r8)
                        OO1il00lI r8 = (p000.OO1il00lI) r8
                        boolean r9 = p000.lI1Ol11OOlll.I0000O(r8)
                        if (r9 == 0) goto Lbb
                        r8.I00000oIO()
                        Iiioii1il r2 = p000.Iiioii1il.I00iOIl
                        goto Lbd
                    Lbb:
                        Iiioii1il r2 = p000.Iiioii1il.I00iio
                    Lbd:
                        return r2
                    */
                    throw new UnsupportedOperationException("Method not decompiled: p000.OiiilII.invokeSuspend(java.lang.Object):java.lang.Object");
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 12 */        public OiiilII(OO1il00lI oO1il00lI, IOoil1iiIilo iOoil1iiIilo) {
                    super(2, iOoil1iiIilo);
/* 13 */            this.I00ilO0 = oO1il00lI;
                }
            }
