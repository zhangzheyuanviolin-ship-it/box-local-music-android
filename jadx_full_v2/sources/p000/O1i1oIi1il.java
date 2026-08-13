            package p000;

            import android.content.Context;
            import java.io.IOException;
            import java.text.SimpleDateFormat;
            
            public abstract class O1i1oIi1il {
                public static final OlO0OIIl1 I00000oIO;
                public static final OOli1O I00000oOI;
                public static boolean I0000Il00O;

                static {
/* 3 */             OlO0OIIl1 olO0OIIl1I00000oIO = OlO0iOl0il.I00000oIO(Boolean.FALSE);
/* 7 */             I00000oIO = olO0OIIl1I00000oIO;
/* 13 */            I00000oOI = ilOoiIi101.I00000oIO(olO0OIIl1I00000oIO);
                }

                public static void I00000oIO(Context context, boolean z) throws IOException {
/* 6 */             Oi010OO0.I001lllioOl(context, "box_settings", 0, "mcp_enabled", z);
/* 9 */             Boolean boolValueOf = Boolean.valueOf(z);
/* 13 */            OlO0OIIl1 olO0OIIl1 = I00000oIO;
/* 15 */            olO0OIIl1.getClass();
/* 19 */            olO0OIIl1.I000lI(null, boolValueOf);
/* 22 */            SimpleDateFormat simpleDateFormat = Oii0IoIiOO.I00000oIO;
/* 37 */            Oii0IoIiOO.I00000oIO(context, "MCP_".concat(z ? "ENABLED" : "DISABLED"));
                }
            }
