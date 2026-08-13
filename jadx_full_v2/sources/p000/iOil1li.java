            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.List;
            
            public abstract class iOil1li {
                public static IIl1Ol I00000oIO(IIl1Ol... iIl1OlArr) {
/* 1 */             List<IIl1Ol> listAsList = Arrays.asList(iIl1OlArr);
/* 9 */             if (listAsList.isEmpty()) {
/* 13 */                return new IIl1i1II0li1();
                    }
/* 23 */            if (listAsList.size() == 1) {
/* 29 */                return (IIl1Ol) listAsList.get(0);
                    }
/* 34 */            IIl1i10oO iIl1i10oO = new IIl1i10oO(0);
/* 42 */            iIl1i10oO.I00000oOI = new ArrayList();
/* 52 */            for (IIl1Ol iIl1Ol : listAsList) {
/* 62 */                if (!(iIl1Ol instanceof IIl1i1II0li1)) {
/* 68 */                    ((ArrayList) iIl1i10oO.I00000oOI).add(iIl1Ol);
                        }
                    }
/* 72 */            VarHandle.storeStoreFence();
/* 77 */            return iIl1i10oO;
                }
            }
