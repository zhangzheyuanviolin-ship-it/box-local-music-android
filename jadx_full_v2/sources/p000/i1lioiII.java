            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.BitSet;
            import java.util.HashSet;
            
/* 18 */    public final class i1lioiII extends liOO10o0 {
                public String I00iio;
                public HashSet I00ilI0I1;
                public I1Io0i0II I00ilO0;
                public Long I00io1l;
                public Long I00ioIO;

                /*  JADX ERROR: Types fix failed
                    jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
                    	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                    	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                    	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:96)
                    */
                /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
                public final java.util.ArrayList I010ioo(java.lang.String r41, java.util.List r42, java.util.List r43, java.lang.Long r44, java.lang.Long r45, boolean r46) {
                    /*  JADX ERROR: Method code generation error
                        java.lang.NullPointerException
                        */
                    /*  JADX ERROR: Types fix failed
                        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
                        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                        */
                    /*
                        Method dump skipped, instructions count: 2767
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: p000.i1lioiII.I010ioo(java.lang.String, java.util.List, java.util.List, java.lang.Long, java.lang.Long, boolean):java.util.ArrayList");
                }

                public final o0oI1IIil0 I010l10O(Integer num) {
/* 7 */             if (this.I00ilO0.containsKey(num)) {
/* 15 */                return (o0oI1IIil0) this.I00ilO0.get(num);
                    }
/* 20 */            String str = this.I00iio;
/* 22 */            o0oI1IIil0 o0oi1iiil0 = new o0oI1IIil0();
/* 25 */            o0oi1iiil0.I000O01llI0 = this;
/* 27 */            o0oi1iiil0.I00000oIO = str;
/* 30 */            o0oi1iiil0.I00000oOI = true;
/* 37 */            o0oi1iiil0.I0000O = new BitSet();
/* 44 */            o0oi1iiil0.I0000oI00 = new BitSet();
/* 52 */            o0oi1iiil0.I0001Ioi1lo = new I1Io0i0II(0);
/* 59 */            o0oi1iiil0.I000II = new I1Io0i0II(0);
/* 61 */            VarHandle.storeStoreFence();
/* 66 */            this.I00ilO0.put(num, o0oi1iiil0);
/* 77 */            return o0oi1iiil0;
                }

                @Override
/* 19 */        public final void I010iIIOlo() {
                }
            }
