            package p000;

            import androidx.work.impl.model.SystemIdInfo;
            import kotlin.jvm.functions.Function1;
            
            public final class OllOi00ooiII implements Function1 {
                public final int I00iOIl;
                public String I00iiI;
                public int I00iiO;

                @Override
                public final Object invoke(Object obj) throws Exception {
                    OiIIl0O1l0l oiIIl0O1l0lI00000oIO;
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 146 */                   String str = this.I00iiI;
/* 148 */                   int i2 = this.I00iiO;
/* 154 */                   oiIIl0O1l0lI00000oIO = ((Olil0III) obj).I00000oIO("DELETE FROM SystemIdInfo where work_spec_id=? AND generation=?");
                            try {
/* 158 */                       oiIIl0O1l0lI00000oIO.I00Io1o110i(1, str);
/* 162 */                       oiIIl0O1l0lI00000oIO.I000OiO(2, i2);
/* 165 */                       oiIIl0O1l0lI00000oIO.I00ol1();
/* 171 */                       return ooiIlOl1iI;
                            } finally {
                            }
                        case 1:
/* 72 */                    String str2 = this.I00iiI;
/* 74 */                    int i3 = this.I00iiO;
/* 80 */                    oiIIl0O1l0lI00000oIO = ((Olil0III) obj).I00000oIO("SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?");
                            try {
/* 84 */                        oiIIl0O1l0lI00000oIO.I00Io1o110i(1, str2);
/* 88 */                        oiIIl0O1l0lI00000oIO.I000OiO(2, i3);
/* 137 */                       return oiIIl0O1l0lI00000oIO.I00ol1() ? new SystemIdInfo(oiIIl0O1l0lI00000oIO.I00i0O(lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "work_spec_id")), (int) oiIIl0O1l0lI00000oIO.getLong(lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "generation")), (int) oiIIl0O1l0lI00000oIO.getLong(lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "system_id"))) : null;
                            } finally {
                            }
                        case 2:
/* 41 */                    int i4 = this.I00iiO;
/* 43 */                    String str3 = this.I00iiI;
/* 49 */                    oiIIl0O1l0lI00000oIO = ((Olil0III) obj).I00000oIO("UPDATE workspec SET stop_reason=? WHERE id=?");
                            try {
/* 54 */                        oiIIl0O1l0lI00000oIO.I000OiO(1, i4);
/* 57 */                        oiIIl0O1l0lI00000oIO.I00Io1o110i(2, str3);
/* 60 */                        oiIIl0O1l0lI00000oIO.I00ol1();
/* 66 */                        return ooiIlOl1iI;
                            } finally {
                            }
                        default:
/* 10 */                    String str4 = this.I00iiI;
/* 12 */                    int i5 = this.I00iiO;
/* 18 */                    oiIIl0O1l0lI00000oIO = ((Olil0III) obj).I00000oIO("UPDATE workspec SET next_schedule_time_override=9223372036854775807 WHERE (id=? AND next_schedule_time_override_generation=?)");
                            try {
/* 22 */                        oiIIl0O1l0lI00000oIO.I00Io1o110i(1, str4);
/* 26 */                        oiIIl0O1l0lI00000oIO.I000OiO(2, i5);
/* 29 */                        oiIIl0O1l0lI00000oIO.I00ol1();
/* 35 */                        return ooiIlOl1iI;
                            } finally {
                            }
                    }
                }
            }
