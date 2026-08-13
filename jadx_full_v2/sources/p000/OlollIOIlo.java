            package p000;

            import android.R;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class OlollIOIlo {
                public static final OlollIOIlo I00iio;
                public static final OlollIOIlo I00ilI0I1;
                public static final OlollIOIlo I00ilO0;
                public static final OlollIOIlo[] I00io1l;
                public final Object I00iOIl;
                public final int I00iiI;
                public final int I00iiO;

                static {
/* 14 */            OlollIOIlo olollIOIlo = new OlollIOIlo(0, R.string.cut, R.attr.actionModeCutDrawable, iO11lolO0lo.I00000oIO, "Cut");
/* 17 */            I00iio = olollIOIlo;
/* 32 */            OlollIOIlo olollIOIlo2 = new OlollIOIlo(1, R.string.copy, R.attr.actionModeCopyDrawable, iO11lolO0lo.I00000oOI, "Copy");
/* 35 */            I00ilI0I1 = olollIOIlo2;
/* 50 */            OlollIOIlo olollIOIlo3 = new OlollIOIlo(2, R.string.paste, R.attr.actionModePasteDrawable, iO11lolO0lo.I0000Il00O, "Paste");
/* 53 */            I00ilO0 = olollIOIlo3;
/* 85 */            OlollIOIlo[] olollIOIloArr = {olollIOIlo, olollIOIlo2, olollIOIlo3, new OlollIOIlo(3, R.string.selectAll, R.attr.actionModeSelectAllDrawable, iO11lolO0lo.I0000O, "SelectAll"), new OlollIOIlo(4, R.string.autofill, 0, iO11lolO0lo.I0000oI00, "Autofill")};
/* 89 */            I00io1l = olollIOIloArr;
/* 91 */            ilIII1o11.I00000oIO(olollIOIloArr);
                }

                public OlollIOIlo(int i, int i2, int i3, Object obj, String str) {
/* 4 */             this.I00iOIl = obj;
/* 6 */             this.I00iiI = i2;
/* 8 */             this.I00iiO = i3;
                }

                public static OlollIOIlo valueOf(String str) {
/* 7 */             return (OlollIOIlo) Enum.valueOf(OlollIOIlo.class, str);
                }

                public static OlollIOIlo[] values() {
/* 7 */             return (OlollIOIlo[]) I00io1l.clone();
                }
            }
