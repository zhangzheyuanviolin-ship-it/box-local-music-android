            package p000;

            import java.text.DateFormat;
            import java.util.Date;
            import java.util.regex.Pattern;
            
            public final class IOoll0l1oOO {
                public static final Pattern I000OiO = Pattern.compile("(\\d{2,4})[^\\d]*");
                public static final Pattern I000iOII = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");
                public static final Pattern I000l1 = Pattern.compile("(\\d{1,2})[^\\d]*");
                public static final Pattern I000lI = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");
                public String I00000oIO;
                public String I00000oOI;
                public long I0000Il00O;
                public String I0000O;
                public String I0000oI00;
                public boolean I0001Ioi1lo;
                public boolean I000II;
                public boolean I000O01llI0;
                public boolean I000OOo1O;

                public final boolean equals(Object obj) {
/* 3 */             if (!(obj instanceof IOoll0l1oOO)) {
/* 81 */                return false;
                    }
/* 5 */             IOoll0l1oOO iOoll0l1oOO = (IOoll0l1oOO) obj;
                    return iOoll0l1oOO.I00000oIO.equals(this.I00000oIO) && iOoll0l1oOO.I00000oOI.equals(this.I00000oOI) && iOoll0l1oOO.I0000Il00O == this.I0000Il00O && iOoll0l1oOO.I0000O.equals(this.I0000O) && iOoll0l1oOO.I0000oI00.equals(this.I0000oI00) && iOoll0l1oOO.I0001Ioi1lo == this.I0001Ioi1lo && iOoll0l1oOO.I000II == this.I000II && iOoll0l1oOO.I000O01llI0 == this.I000O01llI0 && iOoll0l1oOO.I000OOo1O == this.I000OOo1O;
                }

                public final int hashCode() {
/* 59 */            return Boolean.hashCode(this.I000OOo1O) + Oi010OO0.I000OOo1O(Oi010OO0.I000OOo1O(Oi010OO0.I000OOo1O(Oi010OO0.I000O01llI0(Oi010OO0.I000O01llI0(IIlIOloOOO.I0000O(this.I0000Il00O, Oi010OO0.I000O01llI0(Oi010OO0.I000O01llI0(527, 31, this.I00000oIO), 31, this.I00000oOI), 31), 31, this.I0000O), 31, this.I0000oI00), 31, this.I0001Ioi1lo), 31, this.I000II), 31, this.I000O01llI0);
                }

                public final String toString() {
/* 1 */             long j = this.I0000Il00O;
/* 7 */             StringBuilder sb = new StringBuilder(this.I00000oIO);
/* 12 */            sb.append('=');
/* 17 */            sb.append(this.I00000oOI);
/* 22 */            if (this.I000O01llI0) {
/* 28 */                if (j == Long.MIN_VALUE) {
/* 32 */                    sb.append("; max-age=0");
                        } else {
/* 38 */                    sb.append("; expires=");
/* 58 */                    sb.append(((DateFormat) Ii1Oil0IO.I00000oIO.get()).format(new Date(j)));
                        }
                    }
/* 63 */            if (!this.I000OOo1O) {
/* 67 */                sb.append("; domain=");
/* 72 */                sb.append(this.I0000O);
                    }
/* 77 */            sb.append("; path=");
/* 82 */            sb.append(this.I0000oI00);
/* 87 */            if (this.I0001Ioi1lo) {
/* 91 */                sb.append("; secure");
                    }
/* 96 */            if (this.I000II) {
/* 100 */               sb.append("; httponly");
                    }
/* 103 */           return sb.toString();
                }
            }
