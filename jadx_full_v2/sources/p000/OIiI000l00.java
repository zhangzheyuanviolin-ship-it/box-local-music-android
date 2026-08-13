            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class OIiI000l00 extends IlO1i1lOIi {
                public static final OIiI000l00 I0000O = new OIiI000l00(0, 0, 3);

                @Override
                public final void I0000O(IOOOi1 iOOOi1, I1IOO010 i1ioo010, Ol11il011o0 ol11il011o0, OOoo1il oOoo1il, OIiOolI1lio oIiOolI1lio) {
/* 1 */             int i = ol11il011o0.I00111O;
/* 6 */             Ilo0lI ilo0lI = new Ilo0lI(2);
/* 9 */             ilo0lI.I00iiI = oOoo1il;
/* 11 */            ilo0lI.I00iiO = ol11il011o0;
/* 13 */            VarHandle.storeStoreFence();
/* 16 */            ol11il011o0.I000lI(i, ilo0lI);
                }
            }
