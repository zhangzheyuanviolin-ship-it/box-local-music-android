            package p000;

            import java.lang.invoke.VarHandle;
            import java.lang.reflect.InvocationTargetException;
            
            public final class OIi1llo extends IlO1i1lOIi {
                public static final OIi1llo I0000O = new OIi1llo(0, 2, 1);

                @Override
                public final void I0000O(IOOOi1 iOOOi1, I1IOO010 i1ioo010, Ol11il011o0 ol11il011o0, OOoo1il oOoo1il, OIiOolI1lio oIiOolI1lio) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
                    I1I0i0Ilo1Oi i1I0i0Ilo1Oi;
/* 6 */             IooOIOoo0I01 iooOIOoo0I01 = (IooOIOoo0I01) iOOOi1.I0001Ioi1lo(1);
/* 14 */            int i = iooOIOoo0I01 != null ? iooOIOoo0I01.I00000oIO : 0;
/* 19 */            IO0ooOiO0OOo iO0ooOiO0OOo = (IO0ooOiO0OOo) iOOOi1.I0001Ioi1lo(0);
/* 21 */            if (i > 0) {
/* 25 */                IoOi0looIo ioOi0looIo = new IoOi0looIo();
/* 28 */                ioOi0looIo.I00iiO = i1ioo010;
/* 30 */                ioOi0looIo.I00iOIl = i;
/* 32 */                VarHandle.storeStoreFence();
/* 35 */                i1ioo010 = ioOi0looIo;
                    }
/* 36 */            if (oIiOolI1lio != null) {
/* 42 */                i1I0i0Ilo1Oi = new I1I0i0Ilo1Oi(21);
/* 45 */                i1I0i0Ilo1Oi.I00iiI = oIiOolI1lio;
/* 47 */                i1I0i0Ilo1Oi.I00iiO = ol11il011o0;
/* 49 */                VarHandle.storeStoreFence();
                    } else {
/* 53 */                i1I0i0Ilo1Oi = null;
                    }
/* 54 */            iO0ooOiO0OOo.I00000oIO(i1ioo010, ol11il011o0, oOoo1il, i1I0i0Ilo1Oi);
                }
            }
