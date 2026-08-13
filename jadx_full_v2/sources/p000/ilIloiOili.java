            package p000;

            import java.util.Calendar;
            import java.util.Date;
            
            public final class ilIloiOili extends IOOOI0 {
                public ilIl0OII I0000Il00O;

                @Override
                public final void I00O0o1oo(iOlI10l ioli10l, Object obj) {
/* 1 */             ilIl0OII ilil0oii = this.I0000Il00O;
/* 5 */             iOloO1 ioloo1 = (iOloO1) this.I00000oOI;
/* 9 */             StringBuilder sb = (StringBuilder) ioli10l.I0000O;
/* 13 */            if (!(obj instanceof Date) && !(obj instanceof Calendar) && !(obj instanceof Long)) {
/* 40 */                iOlI10l.I00100l0(obj, "%t" + ilil0oii.I00iOIl, sb);
/* 43 */                return;
                    }
/* 48 */            StringBuilder sb2 = new StringBuilder("%");
/* 51 */            ioloo1.I00000oIO(sb2);
/* 66 */            sb2.append(true != ioloo1.I0000Il00O() ? 't' : 'T');
/* 71 */            sb2.append(ilil0oii.I00iOIl);
/* 88 */            sb.append(String.format(ii0iOOOo.I00000oIO, sb2.toString(), obj));
                }
            }
