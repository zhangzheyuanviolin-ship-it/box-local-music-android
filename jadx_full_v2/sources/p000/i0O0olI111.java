            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Arrays;
            import java.util.List;
            import java.util.Map;
            
            public final class i0O0olI111 implements i0O11oO1 {
                public i0O1I1o I00iOIl;
                public String I00iiI;
                public int I00iiO;
                public long I00iio;

                @Override
                public final Object I0000Il00O() {
                    int i;
/* 1 */             i0O1I1o i0o1i1o = this.I00iOIl;
/* 3 */             String str = this.I00iiI;
/* 5 */             int i2 = this.I00iiO;
/* 7 */             long j = this.I00iio;
/* 13 */            List listAsList = Arrays.asList(str);
/* 17 */            i0o1i1o.getClass();
/* 23 */            OoIol00Ool ooIol00Ool = new OoIol00Ool(3);
/* 26 */            ooIol00Ool.I00iiI = i0o1i1o;
/* 28 */            ooIol00Ool.I00iiO = listAsList;
/* 30 */            VarHandle.storeStoreFence();
/* 43 */            i0O10o1 i0o10o1 = (i0O10o1) ((Map) i0o1i1o.I00000oOI(ooIol00Ool)).get(str);
/* 46 */            if (i0o10o1 == null || (i = i0o10o1.I0000Il00O.I0000Il00O) == 5 || i == 6 || i == 4) {
/* 73 */                i0O1I1o.I0001Ioi1lo.I00000oOI(IlIi0I0.I000lI("Could not find pack ", str, " while trying to complete it"), new Object[0]);
                    }
/* 76 */            i0Il00O1 i0il00o1 = i0o1i1o.I00000oIO;
/* 86 */            if (i0il00o1.I0000Il00O(i2, j, str).exists()) {
/* 93 */                i0Il00O1.I000O01llI0(i0il00o1.I0000Il00O(i2, j, str));
                    }
/* 98 */            i0o10o1.I0000Il00O.I0000Il00O = 4;
/* 100 */           return null;
                }
            }
