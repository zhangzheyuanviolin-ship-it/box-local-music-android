            package p000;

            import android.content.ClipData;
            import android.content.ClipboardManager;
            import android.content.Context;
            import android.widget.Toast;
            import java.io.IOException;
            
/* 10 */    public final class I1iO01O1oOo implements IllOOo00lI {
                public final int I00iOIl;
                public Context I00iiI;
                public OI10i0Il I00iiO;

                public I1iO01O1oOo(OI10i0Il oI10i0Il, Context context) {
/* 2 */             this.I00iOIl = 3;
/* 7 */             this.I00iiO = oI10i0Il;
/* 9 */             this.I00iiI = context;
                }

                @Override
                public final Object invoke() throws IOException {
/* 1 */             int i = this.I00iOIl;
/* 6 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 91 */                    Context context = this.I00iiI;
/* 117 */                   ((ClipboardManager) context.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("transcript", ((I1iO1loOII1) this.I00iiO.getValue()).I0001Ioi1lo));
/* 126 */                   Toast.makeText(context, "Copied to clipboard", 0).show();
                            break;
                        case 1:
/* 75 */                    Context context2 = this.I00iiI;
/* 77 */                    OI10i0Il oI10i0Il = this.I00iiO;
/* 79 */                    O1i1oIi1il.I00000oIO(context2, false);
/* 82 */                    OIOlIOlO1.I00000oIO(context2, true);
/* 87 */                    oI10i0Il.setValue(Boolean.FALSE);
                            break;
                        case 2:
/* 53 */                    Context context3 = this.I00iiI;
/* 55 */                    OI10i0Il oI10i0Il2 = this.I00iiO;
/* 57 */                    OlO0OIIl1 olO0OIIl1 = O1i1oIi1il.I00000oIO;
/* 61 */                    Oi010OO0.I001lllioOl(context3, "box_settings", 0, "mcp_disclaimer_shown", true);
/* 64 */                    O1i1oIi1il.I0000Il00O = true;
/* 66 */                    O1i1oIi1il.I00000oIO(context3, true);
/* 71 */                    oI10i0Il2.setValue(Boolean.FALSE);
                            break;
                        default:
/* 12 */                    OI10i0Il oI10i0Il3 = this.I00iiO;
/* 14 */                    Context context4 = this.I00iiI;
/* 22 */                    Oo0oii.I000l1.setValue(oI10i0Il3.getValue());
/* 49 */                    context4.getSharedPreferences("box_settings", 0).edit().putFloat("font_scale", ((Number) oI10i0Il3.getValue()).floatValue()).apply();
                            break;
                    }
/* 52 */            return ooiIlOl1iI;
                }
            }
