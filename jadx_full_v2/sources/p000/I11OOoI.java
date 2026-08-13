            package p000;

            import android.text.SegmentFinder;
            
            public final class I11OOoI extends SegmentFinder {
                public final OoIol00Ool I00000oIO;

                public I11OOoI(OoIol00Ool ooIol00Ool) {
/* 1 */             this.I00000oIO = ooIol00Ool;
                }

                @Override
                public final int nextEndBoundary(int i) {
                    OoIol00Ool ooIol00Ool;
/* 29 */            do {
/* 1 */                 ooIol00Ool = this.I00000oIO;
/* 7 */                 i = ((I1I1OO00o1o) ooIol00Ool.I00iiO).I001IIilI0O(i);
/* 12 */                if (i == -1) {
/* 11 */                    return -1;
                        }
/* 29 */            } while (Character.isWhitespace(((CharSequence) ooIol00Ool.I00iiI).charAt(i - 1)));
/* 77 */            return i;
                }

                @Override
                public final int nextStartBoundary(int i) {
/* 1 */             OoIol00Ool ooIol00Ool = this.I00000oIO;
/* 5 */             CharSequence charSequence = (CharSequence) ooIol00Ool.I00iiI;
/* 33 */            do {
/* 11 */                i = ((I1I1OO00o1o) ooIol00Ool.I00iiO).I001IIilI0O(i);
/* 16 */                if (i == -1 || i == charSequence.length()) {
/* 15 */                    return -1;
                        }
/* 33 */            } while (Character.isWhitespace(charSequence.charAt(i)));
/* 35 */            return i;
                }

                @Override
                public final int previousEndBoundary(int i) {
                    OoIol00Ool ooIol00Ool;
/* 30 */            do {
/* 1 */                 ooIol00Ool = this.I00000oIO;
/* 7 */                 i = ((I1I1OO00o1o) ooIol00Ool.I00iiO).I001i1lo1io(i);
/* 12 */                if (i == -1 || i == 0) {
/* 11 */                    return -1;
                        }
/* 30 */            } while (Character.isWhitespace(((CharSequence) ooIol00Ool.I00iiI).charAt(i - 1)));
/* 32 */            return i;
                }

                @Override
                public final int previousStartBoundary(int i) {
                    OoIol00Ool ooIol00Ool;
/* 27 */            do {
/* 1 */                 ooIol00Ool = this.I00000oIO;
/* 7 */                 i = ((I1I1OO00o1o) ooIol00Ool.I00iiO).I001i1lo1io(i);
/* 12 */                if (i == -1) {
/* 11 */                    return -1;
                        }
/* 27 */            } while (Character.isWhitespace(((CharSequence) ooIol00Ool.I00iiI).charAt(i)));
/* 29 */            return i;
                }
            }
