            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.List;
            
/* 15 */    public final class I11110OIl implements Appendable {
                public final StringBuilder I00iOIl;
                public final ArrayList I00iiI;
                public final ArrayList I00iiO;

                public I11110OIl(int i) {
/* 9 */             this.I00iOIl = new StringBuilder(i);
/* 16 */            this.I00iiI = new ArrayList();
/* 23 */            this.I00iiO = new ArrayList();
/* 27 */            new ArrayList();
                }

                public final void I00000oIO(OlIIi1oIIOlo olIIi1oIIOlo, int i, int i2) {
/* 14 */            this.I00iiO.add(new I111101Olo00(i, i2, 8, olIIi1oIIOlo, null));
                }

                public final void I00000oOI(I1111OO10i i1111OO10i) {
/* 1 */             StringBuilder sb = this.I00iOIl;
/* 3 */             int length = sb.length();
/* 9 */             sb.append(i1111OO10i.I00iiI);
/* 12 */            List list = i1111OO10i.I00iOIl;
/* 14 */            if (list != null) {
/* 19 */                int size = list.size();
/* 24 */                for (int i = 0; i < size; i++) {
/* 30 */                    I11110l0o i11110l0o = (I11110l0o) list.get(i);
/* 49 */                    this.I00iiO.add(new I111101Olo00(i11110l0o.I00000oIO, i11110l0o.I00000oOI + length, i11110l0o.I0000Il00O + length, i11110l0o.I0000O));
                        }
                    }
                }

                public final void I0000Il00O(I1111OO10i i1111OO10i, int i, int i2) {
/* 1 */             StringBuilder sb = this.I00iOIl;
/* 3 */             int length = sb.length();
/* 9 */             sb.append((CharSequence) i1111OO10i.I00iiI, i, i2);
/* 13 */            List listI00000oIO = I111IiO.I00000oIO(i1111OO10i, i, i2, null);
/* 17 */            if (listI00000oIO != null) {
/* 22 */                int size = listI00000oIO.size();
/* 27 */                for (int i3 = 0; i3 < size; i3++) {
/* 33 */                    I11110l0o i11110l0o = (I11110l0o) listI00000oIO.get(i3);
/* 52 */                    this.I00iiO.add(new I111101Olo00(i11110l0o.I00000oIO, i11110l0o.I00000oOI + length, i11110l0o.I0000Il00O + length, i11110l0o.I0000O));
                        }
                    }
                }

                public final void I0000O(String str) {
/* 3 */             this.I00iOIl.append(str);
                }

                public final void I0000oI00() {
/* 1 */             ArrayList arrayList = this.I00iiI;
/* 7 */             if (arrayList.isEmpty()) {
/* 11 */                Ioliol.I0000Il00O("Nothing to pop.");
                    }
/* 27 */            ((I111101Olo00) IIlIOloOOO.I000o00OoI0I(1, arrayList)).I0000Il00O = this.I00iOIl.length();
                }

                public final void I0001Ioi1lo(int i) {
/* 1 */             ArrayList arrayList = this.I00iiI;
/* 7 */             if (i >= arrayList.size()) {
/* 34 */                Ioliol.I0000Il00O(i + " should be less than " + arrayList.size());
                    }
/* 43 */            while (arrayList.size() - 1 >= i) {
/* 45 */                I0000oI00();
                    }
                }

                public final int I000II(O0ooi0ll o0ooi0ll) {
/* 14 */            I111101Olo00 i111101Olo00 = new I111101Olo00(this.I00iOIl.length(), 0, 12, o0ooi0ll, null);
/* 19 */            this.I00iiI.add(i111101Olo00);
/* 24 */            this.I00iiO.add(i111101Olo00);
/* 31 */            return r7.size() - 1;
                }

                public final int I000O01llI0(String str, String str2) {
/* 5 */             OlOli0o olOli0o = new OlOli0o();
/* 8 */             olOli0o.I00000oIO = str2;
/* 10 */            VarHandle.storeStoreFence();
/* 22 */            I111101Olo00 i111101Olo00 = new I111101Olo00(this.I00iOIl.length(), 0, 4, olOli0o, str);
/* 27 */            this.I00iiI.add(i111101Olo00);
/* 32 */            this.I00iiO.add(i111101Olo00);
/* 39 */            return r7.size() - 1;
                }

                public final int I000OOo1O(OlIIi1oIIOlo olIIi1oIIOlo) {
/* 14 */            I111101Olo00 i111101Olo00 = new I111101Olo00(this.I00iOIl.length(), 0, 12, olIIi1oIIOlo, null);
/* 19 */            this.I00iiI.add(i111101Olo00);
/* 24 */            this.I00iiO.add(i111101Olo00);
/* 31 */            return r7.size() - 1;
                }

                public final I1111OO10i I000OiO() {
/* 1 */             StringBuilder sb = this.I00iOIl;
/* 3 */             String string = sb.toString();
/* 9 */             ArrayList arrayList = this.I00iiO;
/* 15 */            ArrayList arrayList2 = new ArrayList(arrayList.size());
/* 18 */            int size = arrayList.size();
/* 23 */            for (int i = 0; i < size; i++) {
/* 39 */                arrayList2.add(((I111101Olo00) arrayList.get(i)).I00000oIO(sb.length()));
                    }
/* 47 */            return new I1111OO10i(string, arrayList2);
                }

                @Override
                public final Appendable append(CharSequence charSequence) {
/* 3 */             if (charSequence instanceof I1111OO10i) {
/* 7 */                 I00000oOI((I1111OO10i) charSequence);
/* 10 */                return this;
                    }
/* 13 */            this.I00iOIl.append(charSequence);
/* 29 */            return this;
                }

                @Override
/* 16 */        public final Appendable append(CharSequence charSequence, int i, int i2) {
/* 17 */            if (charSequence instanceof I1111OO10i) {
/* 18 */                I0000Il00O((I1111OO10i) charSequence, i, i2);
                        return this;
                    }
/* 19 */            this.I00iOIl.append(charSequence, i, i2);
                    return this;
                }

                @Override
/* 19 */        public final Appendable append(char c) {
/* 20 */            this.I00iOIl.append(c);
                    return this;
                }

/* 30 */        public I11110OIl() {
/* 31 */            this(16);
                }

/* 31 */        public I11110OIl(I1111OO10i i1111OO10i) {
/* 32 */            this();
/* 33 */            I00000oOI(i1111OO10i);
                }
            }
