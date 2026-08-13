            package p000;

            import sun.misc.Unsafe;
            
            public class O010loOOi0Oo extends O011OOl11 {
                public final boolean I00iio;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public O010loOOi0Oo(O010OIi o010OIi) {
/* 2 */             super(true);
/* 1 */             boolean z = true;
/* 5 */             I00Iooi00oi(o010OIi);
/* 8 */             Unsafe unsafe = I1Ioolli0l0o.I00000oIO;
/* 10 */            long j = O011OOl11.I00iOIl;
/* 16 */            IOI0oIliI0 iOI0oIliI0 = (IOI0oIliI0) unsafe.getObjectVolatile(this, j);
/* 26 */            IOI0oi1110il iOI0oi1110il = iOI0oIliI0 instanceof IOI0oi1110il ? (IOI0oi1110il) iOI0oIliI0 : null;
/* 28 */            if (iOI0oi1110il == null) {
/* 64 */                z = false;
                        break;
                    }
/* 30 */            O011OOl11 o011OOl11I000lI = iOI0oi1110il.I000lI();
/* 38 */            while (!o011OOl11I000lI.I00IO1()) {
/* 47 */                IOI0oIliI0 iOI0oIliI02 = (IOI0oIliI0) I1Ioolli0l0o.I00000oIO.getObjectVolatile(o011OOl11I000lI, j);
/* 56 */                IOI0oi1110il iOI0oi1110il2 = iOI0oIliI02 instanceof IOI0oi1110il ? (IOI0oi1110il) iOI0oIliI02 : null;
/* 57 */                if (iOI0oi1110il2 == null) {
/* 64 */                    z = false;
                            break;
                        }
/* 59 */                o011OOl11I000lI = iOI0oi1110il2.I000lI();
                    }
/* 65 */            this.I00iio = z;
                }

                @Override
                public final boolean I00IO1() {
/* 1 */             return this.I00iio;
                }

                @Override
                public final boolean I00IO1oi11O() {
/* 1 */             return true;
                }

                public final void I00iIO() {
/* 3 */             I00O10llo(OoiIlOl1iI.I00000oIO);
                }
            }
