            package p000;

            import java.util.regex.Pattern;
            
            public final class IoIIOiIOll extends I00io1l {
                public static final Pattern[][] I0000oI00 = {new Pattern[]{null, null}, new Pattern[]{Pattern.compile("^<(?:script|pre|style|textarea)(?:\\s|>|$)", 2), Pattern.compile("</(?:script|pre|style|textarea)>", 2)}, new Pattern[]{Pattern.compile("^<!--"), Pattern.compile("-->")}, new Pattern[]{Pattern.compile("^<[?]"), Pattern.compile("\\?>")}, new Pattern[]{Pattern.compile("^<![A-Z]"), Pattern.compile(">")}, new Pattern[]{Pattern.compile("^<!\\[CDATA\\["), Pattern.compile("\\]\\]>")}, new Pattern[]{Pattern.compile("^</?(?:address|article|aside|base|basefont|blockquote|body|caption|center|col|colgroup|dd|details|dialog|dir|div|dl|dt|fieldset|figcaption|figure|footer|form|frame|frameset|h1|h2|h3|h4|h5|h6|head|header|hr|html|iframe|legend|li|link|main|menu|menuitem|nav|noframes|ol|optgroup|option|p|param|section|source|summary|table|tbody|td|tfoot|th|thead|title|tr|track|ul)(?:\\s|[/]?[>]|$)", 2), null}, new Pattern[]{Pattern.compile("^(?:<[A-Za-z][A-Za-z0-9-]*(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))?)*\\s*/?>|</[A-Za-z][A-Za-z0-9-]*\\s*[>])\\s*$", 2), null}};
                public IoIIOIlOliO I00000oIO;
                public Pattern I00000oOI;
                public boolean I0000Il00O;
                public O1I1OO I0000O;

                @Override
                public final void I00000oIO(OlII0Io1 olII0Io1) {
/* 1 */             O1I1OO o1i1oo = this.I0000O;
/* 3 */             CharSequence charSequence = olII0Io1.I00000oIO;
/* 7 */             StringBuilder sb = (StringBuilder) o1i1oo.I00iiO;
/* 11 */            if (o1i1oo.I00iiI != 0) {
/* 15 */                sb.append('\n');
                    }
/* 18 */            sb.append(charSequence);
                    o1i1oo.I00iiI++;
/* 27 */            Pattern pattern = this.I00000oOI;
/* 29 */            if (pattern == null || !pattern.matcher(charSequence).find()) {
/* 49 */                return;
                    }
/* 41 */            this.I0000Il00O = true;
                }

                @Override
                public final void I0000oI00() {
/* 13 */            this.I00000oIO.I000II = ((StringBuilder) this.I0000O.I00iiO).toString();
/* 16 */            this.I0000O = null;
                }

                @Override
                public final II0oOIlio0 I0001Ioi1lo() {
/* 1 */             return this.I00000oIO;
                }

                @Override
                public final II0oOO1 I000OOo1O(IiiliIioo0oi iiiliIioo0oi) {
/* 3 */             if (this.I0000Il00O) {
/* 14 */                return null;
                    }
/* 8 */             if (iiiliIioo0oi.I000OOo1O && this.I00000oOI == null) {
/* 14 */                return null;
                    }
/* 18 */            return II0oOO1.I00000oIO(iiiliIioo0oi.I0000Il00O);
                }
            }
