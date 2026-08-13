            package p000;

            import java.util.Iterator;
            import java.util.LinkedList;
            import java.util.ListIterator;
            
            public final class OlIl01 implements IiIolo {
                public char I00000oIO;
                public int I00000oOI;
                public LinkedList I0000Il00O;

                @Override
                public final int I00000oIO(IiIoiiOoIi iiIoiiOoIi, IiIoiiOoIi iiIoiiOoIi2) {
                    IiIolo iiIolo;
/* 3 */             int size = iiIoiiOoIi.I00000oIO.size();
/* 7 */             LinkedList linkedList = this.I0000Il00O;
/* 9 */             Iterator it = linkedList.iterator();
                    while (true) {
/* 17 */                if (!it.hasNext()) {
/* 37 */                    iiIolo = (IiIolo) linkedList.getFirst();
                            break;
                        }
/* 23 */                iiIolo = (IiIolo) it.next();
/* 29 */                if (iiIolo.I0000Il00O() <= size) {
                            break;
                        }
                    }
/* 39 */            return iiIolo.I00000oIO(iiIoiiOoIi, iiIoiiOoIi2);
                }

                @Override
                public final char I00000oOI() {
/* 1 */             return this.I00000oIO;
                }

                @Override
                public final int I0000Il00O() {
/* 1 */             return this.I00000oOI;
                }

                @Override
                public final char I0000O() {
/* 1 */             return this.I00000oIO;
                }

                public final void I0000oI00(IiIolo iiIolo) {
/* 1 */             int iI0000Il00O = iiIolo.I0000Il00O();
/* 5 */             LinkedList linkedList = this.I0000Il00O;
/* 7 */             ListIterator listIterator = linkedList.listIterator();
/* 15 */            while (listIterator.hasNext()) {
/* 21 */                IiIolo iiIolo2 = (IiIolo) listIterator.next();
/* 23 */                int iI0000Il00O2 = iiIolo2.I0000Il00O();
/* 27 */                if (iI0000Il00O > iI0000Il00O2) {
/* 29 */                    listIterator.previous();
/* 32 */                    listIterator.add(iiIolo);
/* 35 */                    return;
                        } else if (iI0000Il00O == iI0000Il00O2) {
/* 84 */                    throw new IllegalArgumentException("Cannot add two delimiter processors for char '" + this.I00000oIO + "' and minimum length " + iI0000Il00O + "; conflicting processors: " + iiIolo2 + ", " + iiIolo);
                        }
                    }
/* 85 */            linkedList.add(iiIolo);
/* 88 */            this.I00000oOI = iI0000Il00O;
                }
            }
