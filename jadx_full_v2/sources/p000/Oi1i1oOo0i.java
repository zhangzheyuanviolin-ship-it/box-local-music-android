            package p000;

            import kotlin.jvm.functions.Function1;
            
            public final class Oi1i1oOo0i extends Oi10IOIi implements IlliIl1l11O {
                public final int I00iiI;
                public int I00iiO;
                public Object I00iio;
                public final Function1 I00ilI0I1;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Oi1i1oOo0i(int i, IOoil1iiIilo iOoil1iiIilo, Function1 function1) {
/* 6 */             super(2, iOoil1iiIilo);
/* 1 */             this.I00iiI = i;
/* 3 */             this.I00ilI0I1 = function1;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 1 */             int i = this.I00iiI;
/* 3 */             Function1 function1 = this.I00ilI0I1;
                    switch (i) {
                        case 0:
/* 20 */                    Oi1i1oOo0i oi1i1oOo0i = new Oi1i1oOo0i(0, iOoil1iiIilo, function1);
/* 23 */                    oi1i1oOo0i.I00iio = obj;
/* 25 */                    return oi1i1oOo0i;
                        default:
/* 11 */                    Oi1i1oOo0i oi1i1oOo0i2 = new Oi1i1oOo0i(1, iOoil1iiIilo, function1);
/* 14 */                    oi1i1oOo0i2.I00iio = obj;
/* 16 */                    return oi1i1oOo0i2;
                    }
                }

                @Override
                public final Object invoke(Object obj, Object obj2) throws Throwable {
/* 1 */             int i = this.I00iiI;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 5 */             Oll11lOlo oll11lOlo = (Oll11lOlo) obj;
/* 7 */             IOoil1iiIilo iOoil1iiIilo = (IOoil1iiIilo) obj2;
                    switch (i) {
                        case 0:
/* 30 */                    return ((Oi1i1oOo0i) create(oll11lOlo, iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                        default:
/* 18 */                    ((Oi1i1oOo0i) create(oll11lOlo, iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
/* 21 */                    return Ii0111o.I00iOIl;
                    }
                }

                /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                    jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
                    	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                    	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                    	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                    */
                /* JADX WARN: Removed duplicated region for block: B:12:0x0033  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0031 -> B:14:0x0035). Please report as a decompilation issue!!! */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
                    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
                        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                        */
                    /*  JADX ERROR: Method code generation error
                        java.lang.NullPointerException
                        */
                    /*
                        r9 = this;
                        int r0 = r9.I00iiI
                        kotlin.jvm.functions.Function1 r1 = r9.I00ilI0I1
                        java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                        r3 = 1
                        r4 = 0
                        switch(r0) {
                            case 0: goto L44;
                            default: goto Lb;
                        }
                    Lb:
                        Ii0111o r0 = p000.Ii0111o.I00iOIl
                        int r5 = r9.I00iiO
                        if (r5 == 0) goto L1f
                        if (r5 != r3) goto L1b
                        java.lang.Object r2 = r9.I00iio
                        Oll11lOlo r2 = (p000.Oll11lOlo) r2
                        p000.lIoii1l01l0i.I00000oOI(r10)
                        goto L35
                    L1b:
                        p000.I000II.I001IO000(r2)
                        goto L34
                    L1f:
                        p000.lIoii1l01l0i.I00000oOI(r10)
                        java.lang.Object r10 = r9.I00iio
                        Oll11lOlo r10 = (p000.Oll11lOlo) r10
                        r2 = r10
                    L27:
                        OO1i0l r10 = p000.OO1i0l.I00iOIl
                        r9.I00iio = r2
                        r9.I00iiO = r3
                        java.lang.Object r10 = r2.I00000oOI(r10, r9)
                        if (r10 != r0) goto L35
                        r4 = r0
                    L34:
                        return r4
                    L35:
                        OO1Oooio101 r10 = (p000.OO1Oooio101) r10
                        boolean r10 = p000.OiiilIOo.I00000oIO(r10)
                        r10 = r10 ^ r3
                        java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
                        r1.invoke(r10)
                        goto L27
                    L44:
                        Ii0111o r0 = p000.Ii0111o.I00iOIl
                        int r5 = r9.I00iiO
                        r6 = 2
                        if (r5 == 0) goto L5f
                        if (r5 == r3) goto L57
                        if (r5 != r6) goto L53
                        p000.lIoii1l01l0i.I00000oOI(r10)
                        goto L90
                    L53:
                        p000.I000II.I001IO000(r2)
                        goto L99
                    L57:
                        java.lang.Object r2 = r9.I00iio
                        Oll11lOlo r2 = (p000.Oll11lOlo) r2
                        p000.lIoii1l01l0i.I00000oOI(r10)
                        goto L72
                    L5f:
                        p000.lIoii1l01l0i.I00000oOI(r10)
                        java.lang.Object r10 = r9.I00iio
                        r2 = r10
                        Oll11lOlo r2 = (p000.Oll11lOlo) r2
                        r9.I00iio = r2
                        r9.I00iiO = r3
                        java.lang.Object r10 = p000.lIol1IoOO01.I00000oIO(r2, r9)
                        if (r10 != r0) goto L72
                        goto L8e
                    L72:
                        OO1il00lI r10 = (p000.OO1il00lI) r10
                        r10.I00000oIO()
                        long r7 = r10.I0000Il00O
                        OIOlIiiioi r10 = p000.OIOlIiiioi.I00000oIO(r7)
                        r1.invoke(r10)
                        r9.I00iio = r4
                        r9.I00iiO = r6
                        IillI1lo11l0 r10 = p000.OloI0l1i1oO.I00000oIO
                        OO1i0l r10 = p000.OO1i0l.I00iiI
                        java.lang.Object r10 = p000.OloI0l1i1oO.I000OiO(r2, r10, r9)
                        if (r10 != r0) goto L90
                    L8e:
                        r4 = r0
                        goto L99
                    L90:
                        OO1il00lI r10 = (p000.OO1il00lI) r10
                        if (r10 == 0) goto L97
                        r10.I00000oIO()
                    L97:
                        OoiIlOl1iI r4 = p000.OoiIlOl1iI.I00000oIO
                    L99:
                        return r4
                    */
                    throw new UnsupportedOperationException("Method not decompiled: p000.Oi1i1oOo0i.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }
