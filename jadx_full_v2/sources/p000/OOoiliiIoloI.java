            package p000;

            import java.io.Serializable;
            import java.lang.invoke.VarHandle;
            import java.util.regex.Matcher;
            import java.util.regex.Pattern;
            
/* 11 */    public final class OOoiliiIoloI implements Serializable {
                public final Pattern I00iOIl;

                /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
                public OOoiliiIoloI(String str, int i) {
/* 9 */             this(Pattern.compile(str, 66));
/* 1 */             OOoilolI10I[] oOoilolI10IArr = OOoilolI10I.I00iOIl;
                }

                public static O1OlOOioiI I00000oIO(OOoiliiIoloI oOoiliiIoloI, CharSequence charSequence) {
/* 8 */             return lIo0ol0oI010.I00000oIO(oOoiliiIoloI.I00iOIl.matcher(charSequence), 0, charSequence);
                }

                public static IlIl0l I00000oOI(OOoiliiIoloI oOoiliiIoloI, String str) {
/* 1 */             oOoiliiIoloI.getClass();
/* 8 */             if (str.length() < 0) {
/* 45 */                OIiilo1Ool0o.I0000Il00O(str.length(), IlIi0I0.I00100o1O0lo("Start index out of bounds: ", 0, ", input length: "));
/* 48 */                return null;
                    }
/* 14 */            O1l110o o1l110o = new O1l110o(14);
/* 17 */            o1l110o.I00iiI = oOoiliiIoloI;
/* 19 */            o1l110o.I00iiO = str;
/* 21 */            VarHandle.storeStoreFence();
/* 28 */            return new IlIl0l(o1l110o, OOoilIo10o.I00ioIO);
                }

                public final O1OlOOioiI I0000Il00O(CharSequence charSequence) {
/* 3 */             Matcher matcher = this.I00iOIl.matcher(charSequence);
/* 11 */            if (matcher.matches()) {
/* 17 */                return new O1OlOOioiI(matcher, charSequence);
                    }
/* 13 */            return null;
                }

                public final boolean I0000O(CharSequence charSequence) {
/* 7 */             return this.I00iOIl.matcher(charSequence).matches();
                }

                public final String I0000oI00(String str, String str2) {
/* 7 */             return this.I00iOIl.matcher(str).replaceAll(str2);
                }

                public final String toString() {
/* 3 */             return this.I00iOIl.toString();
                }

/* 12 */        public OOoiliiIoloI(String str) {
/* 13 */            this(Pattern.compile(str));
                }

/* 13 */        public OOoiliiIoloI(Pattern pattern) {
/* 15 */            this.I00iOIl = pattern;
                }
            }
