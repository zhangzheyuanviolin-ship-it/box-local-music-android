            package p000;
            
            public final class II0I1iIi extends Oi10IOIi implements IlliIl1l11O {
                public int I00iiI;
                public Object I00iiO;
                public final double I00iio;
                public final double I00ilI0I1;
                public final OI10i0Il I00ilO0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public II0I1iIi(double d, double d2, OI10i0Il oI10i0Il, IOoil1iiIilo iOoil1iiIilo) {
/* 8 */             super(2, iOoil1iiIilo);
/* 1 */             this.I00iio = d;
/* 3 */             this.I00ilI0I1 = d2;
/* 5 */             this.I00ilO0 = oI10i0Il;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 10 */            II0I1iIi iI0I1iIi = new II0I1iIi(this.I00iio, this.I00ilI0I1, this.I00ilO0, iOoil1iiIilo);
/* 13 */            iI0I1iIi.I00iiO = obj;
/* 37 */            return iI0I1iIi;
                }

                @Override
                public final Object invoke(Object obj, Object obj2) throws Throwable {
/* 13 */            ((II0I1iIi) create((Oll11lOlo) obj, (IOoil1iiIilo) obj2)).invokeSuspend(OoiIlOl1iI.I00000oIO);
/* 16 */            return Ii0111o.I00iOIl;
                }

                /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                    jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
                    	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                    	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                    	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                    */
                /* JADX WARN: Removed duplicated region for block: B:11:0x0027 A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
                /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
                /* JADX WARN: Removed duplicated region for block: B:17:0x003e  */
                /* JADX WARN: Removed duplicated region for block: B:25:0x007d A[LOOP:0: B:23:0x0077->B:25:0x007d, LOOP_END] */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:12:0x0028). Please report as a decompilation issue!!! */
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
                        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.IContainer.get(jadx.api.plugins.input.data.attributes.IJadxAttrType)" because "cont" is null
                        	at jadx.core.codegen.RegionGen.declareVars(RegionGen.java:70)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:65)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:298)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:282)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:410)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        */
                    /*
                        r9 = this;
                        java.lang.Object r0 = r9.I00iiO
                        Oll11lOlo r0 = (p000.Oll11lOlo) r0
                        Ii0111o r1 = p000.Ii0111o.I00iOIl
                        int r2 = r9.I00iiI
                        r3 = 0
                        r4 = 1
                        if (r2 == 0) goto L18
                        if (r2 != r4) goto L12
                        p000.lIoii1l01l0i.I00000oOI(r10)
                        goto L28
                    L12:
                        java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                        p000.I000II.I001IO000(r9)
                        return r3
                    L18:
                        p000.lIoii1l01l0i.I00000oOI(r10)
                    L1b:
                        r9.I00iiO = r0
                        r9.I00iiI = r4
                        OO1i0l r10 = p000.OO1i0l.I00iiI
                        java.lang.Object r10 = r0.I00000oOI(r10, r9)
                        if (r10 != r1) goto L28
                        return r1
                    L28:
                        OO1Oooio101 r10 = (p000.OO1Oooio101) r10
                        java.util.List r2 = r10.I00000oIO
                        java.lang.Object r2 = p000.IOOi0Ool1i.I00II0Ol1O0l(r2)
                        OO1il00lI r2 = (p000.OO1il00lI) r2
                        if (r2 == 0) goto L3b
                        long r5 = r2.I0000Il00O
                        OIOlIiiioi r2 = p000.OIOlIiiioi.I00000oIO(r5)
                        goto L3c
                    L3b:
                        r2 = r3
                    L3c:
                        if (r2 == 0) goto L1b
                        int r5 = r10.I0001Ioi1lo
                        if (r5 != r4) goto L43
                        goto L46
                    L43:
                        r6 = 3
                        if (r5 != r6) goto L1b
                    L46:
                        long r5 = r2.I00000oIO
                        r7 = 4294967295(0xffffffff, double:2.1219957905E-314)
                        long r5 = r5 & r7
                        int r2 = (int) r5
                        float r2 = java.lang.Float.intBitsToFloat(r2)
                        Oll1OII0o r5 = r0.I00ilO0
                        long r5 = r5.I00olI
                        long r5 = r5 & r7
                        int r5 = (int) r5
                        float r5 = (float) r5
                        float r2 = r2 / r5
                        r5 = 1065353216(0x3f800000, float:1.0)
                        float r5 = r5 - r2
                        double r5 = (double) r5
                        double r7 = r9.I00ilI0I1
                        double r5 = r5 * r7
                        double r7 = r9.I00iio
                        double r5 = r5 + r7
                        java.lang.Double r2 = new java.lang.Double
                        r2.<init>(r5)
                        OI10i0Il r5 = r9.I00ilO0
                        r5.setValue(r2)
                        java.util.List r10 = r10.I00000oIO
                        java.lang.Iterable r10 = (java.lang.Iterable) r10
                        java.util.Iterator r10 = r10.iterator()
                    L77:
                        boolean r2 = r10.hasNext()
                        if (r2 == 0) goto L1b
                        java.lang.Object r2 = r10.next()
                        OO1il00lI r2 = (p000.OO1il00lI) r2
                        r2.I00000oIO()
                        goto L77
                    */
                    throw new UnsupportedOperationException("Method not decompiled: p000.II0I1iIi.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }
