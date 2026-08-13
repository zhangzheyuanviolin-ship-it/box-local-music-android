            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Arrays;
            import java.util.List;
            
            public abstract class iliIOll0 {
                public static final IliOii1lO I00000oIO(Oi0l1olOi... oi0l1olOiArr) {
/* 3 */             List listAsList = Arrays.asList(oi0l1olOiArr);
/* 7 */             IliOii1lO iliOii1lO = new IliOii1lO();
/* 10 */            iliOii1lO.I00ilO0 = listAsList;
/* 18 */            if (!listAsList.isEmpty()) {
/* 29 */                VarHandle.storeStoreFence();
/* 77 */                return iliOii1lO;
                    }
/* 22 */            Ioliol.I0000Il00O("At least one font should be passed to FontFamily");
/* 25 */            VarHandle.storeStoreFence();
/* 28 */            return iliOii1lO;
                }
            }
