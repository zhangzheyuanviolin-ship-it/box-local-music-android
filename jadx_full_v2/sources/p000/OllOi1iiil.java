            package p000;

            import androidx.work.impl.model.SystemIdInfo;
            import androidx.work.impl.model.SystemIdInfoDao;
            import java.lang.invoke.VarHandle;
            import java.util.List;
            
/* 19 */    public final class OllOi1iiil implements SystemIdInfoDao {
                public Oi1oIiOiIi0 I00000oIO;
                public IOol1o01iII I00000oOI;

                @Override
                public final SystemIdInfo getSystemIdInfo(String str, int i) {
/* 1 */             Oi1oIiOiIi0 oi1oIiOiIi0 = this.I00000oIO;
/* 6 */             OllOi00ooiII ollOi00ooiII = new OllOi00ooiII(1);
/* 9 */             ollOi00ooiII.I00iiI = str;
/* 11 */            ollOi00ooiII.I00iiO = i;
/* 13 */            VarHandle.storeStoreFence();
/* 21 */            return (SystemIdInfo) il01ioIoI.I00000oOI(oi1oIiOiIi0, true, false, ollOi00ooiII);
                }

                @Override
                public final List getWorkSpecIds() {
/* 1 */             Oi1oIiOiIi0 oi1oIiOiIi0 = this.I00000oIO;
/* 7 */             OiioI1Io0o oiioI1Io0o = new OiioI1Io0o(20);
/* 10 */            VarHandle.storeStoreFence();
/* 19 */            return (List) il01ioIoI.I00000oOI(oi1oIiOiIi0, true, false, oiioI1Io0o);
                }

                @Override
                public final void insertSystemIdInfo(SystemIdInfo systemIdInfo) {
/* 1 */             Oi1oIiOiIi0 oi1oIiOiIi0 = this.I00000oIO;
/* 7 */             OiOi011iI1ol oiOi011iI1ol = new OiOi011iI1ol(10);
/* 10 */            oiOi011iI1ol.I00iiI = this;
/* 12 */            oiOi011iI1ol.I00iiO = systemIdInfo;
/* 14 */            VarHandle.storeStoreFence();
/* 19 */            il01ioIoI.I00000oOI(oi1oIiOiIi0, false, true, oiOi011iI1ol);
                }

                @Override
                public final void removeSystemIdInfo(String str, int i) {
/* 1 */             Oi1oIiOiIi0 oi1oIiOiIi0 = this.I00000oIO;
/* 6 */             OllOi00ooiII ollOi00ooiII = new OllOi00ooiII(0);
/* 9 */             ollOi00ooiII.I00iiI = str;
/* 11 */            ollOi00ooiII.I00iiO = i;
/* 13 */            VarHandle.storeStoreFence();
/* 17 */            il01ioIoI.I00000oOI(oi1oIiOiIi0, false, true, ollOi00ooiII);
                }

                @Override
/* 20 */        public final void removeSystemIdInfo(String str) {
/* 21 */            Oi1oIiOiIi0 oi1oIiOiIi0 = this.I00000oIO;
                    OlOoOOIIi olOoOOIIi = new OlOoOOIIi(1);
                    olOoOOIIi.I00iiI = str;
                    VarHandle.storeStoreFence();
/* 22 */            il01ioIoI.I00000oOI(oi1oIiOiIi0, false, true, olOoOOIIi);
                }
            }
