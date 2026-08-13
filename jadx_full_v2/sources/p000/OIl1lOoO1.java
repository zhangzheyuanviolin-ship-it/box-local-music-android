            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class OIl1lOoO1 {
                public static final OIl1lOoO1 I00000oOI;
                public I1OooIoiIO I00000oIO;

                static {
/* 3 */             OIl1lOoO1 oIl1lOoO1 = new OIl1lOoO1();
/* 16 */            oIl1lOoO1.I00000oIO = iOOOIOoiIlII.I0000O(0L);
/* 18 */            VarHandle.storeStoreFence();
/* 21 */            I00000oOI = oIl1lOoO1;
                }

                public final boolean I00000oIO(long j, long j2) {
                    return (j - j2) + ((Number) this.I00000oIO.I00000oIO).longValue() == 0;
                }
            }
