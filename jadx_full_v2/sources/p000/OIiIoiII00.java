            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Set;
            
            public final class OIiIoiII00 extends IlO1i1lOIi {
                public static final OIiIoiII00 I0000O = new OIiIoiII00(0, 1, 1);

                @Override
                public final void I0000O(IOOOi1 iOOOi1, I1IOO010 i1ioo010, Ol11il011o0 ol11il011o0, OOoo1il oOoo1il, OIiOolI1lio oIiOolI1lio) {
/* 6 */             OOloioIl oOloioIl = (OOloioIl) iOOOi1.I0001Ioi1lo(0);
/* 10 */            Set set = (Set) oOoo1il.I00000oIO;
/* 12 */            if (set == null) {
/* 14 */                return;
                    }
/* 17 */            OO0iiO oO0iiO = new OO0iiO();
/* 20 */            oO0iiO.I00iOIl = set;
/* 31 */            oO0iiO.I00iiI = new OI110O0(new IloI1lO1IiI0[16]);
/* 33 */            VarHandle.storeStoreFence();
/* 38 */            OI10I1IoI0Ol oI10I1IoI0Ol = (OI10I1IoI0Ol) oOoo1il.I000OiO;
/* 40 */            if (oI10I1IoI0Ol == null) {
/* 42 */                long[] jArr = OiO10oio.I00000oIO;
/* 46 */                oI10I1IoI0Ol = new OI10I1IoI0Ol();
/* 49 */                oOoo1il.I000OiO = oI10I1IoI0Ol;
                    }
/* 51 */            oI10I1IoI0Ol.I000lI(oOloioIl, oO0iiO);
/* 64 */            ((OI110O0) oOoo1il.I0000O).I00000oOI(new IloI1lO1IiI0(oO0iiO, -1));
                }
            }
