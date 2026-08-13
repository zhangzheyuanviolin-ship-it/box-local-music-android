            package p000;

            import kotlin.jvm.functions.Function1;
            
            public final class i01Ollo11II implements Function1 {
                public final int I00iOIl;
                public long I00iiI;
                public String I00iiO;

                @Override
                public final Object invoke(Object obj) throws Exception {
                    OiIIl0O1l0l oiIIl0O1l0lI00000oIO;
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 78 */                    long j = this.I00iiI;
/* 80 */                    String str = this.I00iiO;
/* 86 */                    oiIIl0O1l0lI00000oIO = ((Olil0III) obj).I00000oIO("UPDATE workspec SET next_schedule_time_override=? WHERE id=?");
                            try {
/* 90 */                        oiIIl0O1l0lI00000oIO.I000OiO(1, j);
/* 93 */                        oiIIl0O1l0lI00000oIO.I00Io1o110i(2, str);
/* 96 */                        oiIIl0O1l0lI00000oIO.I00ol1();
/* 102 */                       return ooiIlOl1iI;
                            } finally {
                            }
                        case 1:
/* 40 */                    long j2 = this.I00iiI;
/* 42 */                    String str2 = this.I00iiO;
/* 44 */                    Olil0III olil0III = (Olil0III) obj;
/* 48 */                    oiIIl0O1l0lI00000oIO = olil0III.I00000oIO("UPDATE workspec SET schedule_requested_at=? WHERE id=?");
                            try {
/* 52 */                        oiIIl0O1l0lI00000oIO.I000OiO(1, j2);
/* 55 */                        oiIIl0O1l0lI00000oIO.I00Io1o110i(2, str2);
/* 58 */                        oiIIl0O1l0lI00000oIO.I00ol1();
/* 61 */                        int iI00000oIO = lO01iO1I1lOi.I00000oIO(olil0III);
/* 65 */                        oiIIl0O1l0lI00000oIO.close();
/* 68 */                        return Integer.valueOf(iI00000oIO);
                            } finally {
                            }
                        default:
/* 10 */                    long j3 = this.I00iiI;
/* 12 */                    String str3 = this.I00iiO;
/* 18 */                    oiIIl0O1l0lI00000oIO = ((Olil0III) obj).I00000oIO("UPDATE workspec SET last_enqueue_time=? WHERE id=?");
                            try {
/* 22 */                        oiIIl0O1l0lI00000oIO.I000OiO(1, j3);
/* 25 */                        oiIIl0O1l0lI00000oIO.I00Io1o110i(2, str3);
/* 28 */                        oiIIl0O1l0lI00000oIO.I00ol1();
/* 34 */                        return ooiIlOl1iI;
                            } finally {
                            }
                    }
                }
            }
