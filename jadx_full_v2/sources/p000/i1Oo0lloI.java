            package p000;

            import java.util.Calendar;
            import java.util.Date;
            
            public final class i1Oo0lloI extends IOOOI0 {
                public i1Olo0i11o1o I0000Il00O;

                @Override
                public final void I00O10llo(iOlI10l ioli10l, Object obj) {
/* 1 */             i1Olo0i11o1o i1olo0i11o1o = this.I0000Il00O;
/* 5 */             o10o1Oo o10o1oo = (o10o1Oo) this.I00000oOI;
/* 9 */             StringBuilder sb = (StringBuilder) ioli10l.I0000O;
/* 13 */            if ((obj instanceof Date) || (obj instanceof Calendar) || (obj instanceof Long)) {
/* 61 */                StringBuilder sb2 = new StringBuilder("%");
/* 64 */                o10o1oo.I0000O(sb2);
/* 79 */                sb2.append(true != o10o1oo.I0000Il00O() ? 't' : 'T');
/* 84 */                sb2.append(i1olo0i11o1o.I00iOIl);
/* 101 */               sb.append(String.format(o11I00.I00000oIO, sb2.toString(), obj));
/* 106 */               return;
                    }
/* 24 */            char c = i1olo0i11o1o.I00iOIl;
/* 38 */            StringBuilder sb3 = new StringBuilder(String.valueOf(c).length() + 2);
/* 43 */            sb3.append("%t");
/* 46 */            sb3.append(c);
/* 53 */            iOlI10l.I00100o1O0lo(obj, sb3.toString(), sb);
                }
            }
