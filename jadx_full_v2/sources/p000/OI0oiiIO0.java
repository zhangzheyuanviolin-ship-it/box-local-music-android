            package p000;

            import java.util.Arrays;
            import java.util.List;
            
/* 12 */    public final class OI0oiiIO0 {
                public Object[] I00000oIO;
                public int I00000oOI;
                public OI0oIOI I0000Il00O;

                public OI0oiiIO0(int i) {
/* 11 */            this.I00000oIO = i == 0 ? OIOi1o0101.I00000oIO : new Object[i];
                }

                public final void I00000oIO(int i, Object obj) {
                    int i2;
/* 1 */             if (i < 0 || i > (i2 = this.I00000oOI)) {
/* 41 */                StringBuilder sbI00100o1O0lo = IlIi0I0.I00100o1O0lo("Index ", i, " must be in 0..");
/* 47 */                sbI00100o1O0lo.append(this.I00000oOI);
/* 54 */                lO00l0o.I00000oOI(sbI00100o1O0lo.toString());
/* 106 */               throw null;
                    }
/* 7 */             int i3 = i2 + 1;
/* 9 */             Object[] objArr = this.I00000oIO;
/* 12 */            if (objArr.length < i3) {
/* 14 */                I000o00OoI0I(i3, objArr);
                    }
/* 17 */            Object[] objArr2 = this.I00000oIO;
/* 19 */            int i4 = this.I00000oOI;
/* 21 */            if (i != i4) {
/* 25 */                I1IoiO1l.I000iOII(objArr2, i + 1, objArr2, i, i4);
                    }
/* 28 */            objArr2[i] = obj;
                    this.I00000oOI++;
                }

                public final void I00000oOI(Object obj) {
/* 3 */             int i = this.I00000oOI + 1;
/* 5 */             Object[] objArr = this.I00000oIO;
/* 8 */             if (objArr.length < i) {
/* 10 */                I000o00OoI0I(i, objArr);
                    }
/* 13 */            Object[] objArr2 = this.I00000oIO;
/* 15 */            int i2 = this.I00000oOI;
/* 17 */            objArr2[i2] = obj;
/* 21 */            this.I00000oOI = i2 + 1;
                }

                public final void I0000Il00O(OI0oiiIO0 oI0oiiIO0) {
/* 5 */             if (oI0oiiIO0.I000OOo1O()) {
/* 77 */                return;
                    }
/* 12 */            int i = this.I00000oOI + oI0oiiIO0.I00000oOI;
/* 13 */            Object[] objArr = this.I00000oIO;
/* 16 */            if (objArr.length < i) {
/* 18 */                I000o00OoI0I(i, objArr);
                    }
/* 30 */            I1IoiO1l.I000iOII(oI0oiiIO0.I00000oIO, this.I00000oOI, this.I00000oIO, 0, oI0oiiIO0.I00000oOI);
                    this.I00000oOI += oI0oiiIO0.I00000oOI;
                }

                public final void I0000O(List list) {
/* 5 */             if (list.isEmpty()) {
/* 77 */                return;
                    }
/* 8 */             int i = this.I00000oOI;
/* 14 */            int size = list.size() + i;
/* 15 */            Object[] objArr = this.I00000oIO;
/* 18 */            if (objArr.length < size) {
/* 20 */                I000o00OoI0I(size, objArr);
                    }
/* 23 */            Object[] objArr2 = this.I00000oIO;
/* 28 */            int size2 = list.size();
/* 33 */            for (int i2 = 0; i2 < size2; i2++) {
/* 41 */                objArr2[i2 + i] = list.get(i2);
                    }
/* 53 */            this.I00000oOI = list.size() + this.I00000oOI;
                }

                public final void I0000oI00() {
/* 7 */             Arrays.fill(this.I00000oIO, 0, this.I00000oOI, (Object) null);
/* 10 */            this.I00000oOI = 0;
                }

                public final Object I0001Ioi1lo() {
/* 5 */             if (!I000OOo1O()) {
/* 10 */                return this.I00000oIO[0];
                    }
/* 15 */            lO00l0o.I0000Il00O("ObjectList is empty.");
/* 20 */            throw null;
                }

                public final Object I000II(int i) {
/* 1 */             if (i >= 0 && i < this.I00000oOI) {
/* 9 */                 return this.I00000oIO[i];
                    }
/* 12 */            I00100l0(i);
/* 29 */            throw null;
                }

                public final int I000O01llI0(Object obj) {
/* 1 */             Object[] objArr = this.I00000oIO;
/* 3 */             int i = 0;
/* 4 */             if (obj == null) {
/* 6 */                 int i2 = this.I00000oOI;
/* 8 */                 while (i < i2) {
/* 12 */                    if (objArr[i] == null) {
/* 14 */                        return i;
                            }
/* 15 */                    i++;
                        }
/* 34 */                return -1;
                    }
/* 18 */            int i3 = this.I00000oOI;
/* 20 */            while (i < i3) {
/* 28 */                if (obj.equals(objArr[i])) {
/* 30 */                    return i;
                        }
/* 31 */                i++;
                    }
/* 34 */            return -1;
                }

                public final boolean I000OOo1O() {
                    return this.I00000oOI == 0;
                }

                public final boolean I000OiO() {
                    return this.I00000oOI != 0;
                }

                public final boolean I000iOII(Object obj) {
/* 1 */             int iI000O01llI0 = I000O01llI0(obj);
/* 5 */             if (iI000O01llI0 < 0) {
/* 12 */                return false;
                    }
/* 7 */             I000l1(iI000O01llI0);
/* 10 */            return true;
                }

                public final Object I000l1(int i) {
                    int i2;
/* 2 */             if (i < 0 || i >= (i2 = this.I00000oOI)) {
/* 30 */                I00100l0(i);
/* 77 */                throw null;
                    }
/* 8 */             Object[] objArr = this.I00000oIO;
/* 10 */            Object obj = objArr[i];
/* 14 */            if (i != i2 - 1) {
/* 18 */                I1IoiO1l.I000iOII(objArr, i, objArr, i + 1, i2);
                    }
                    int i3 = this.I00000oOI - 1;
/* 25 */            this.I00000oOI = i3;
/* 27 */            objArr[i3] = null;
/* 29 */            return obj;
                }

                public final void I000lI(int i, int i2) {
                    int i3;
/* 4 */             if (i < 0 || i > (i3 = this.I00000oOI) || i2 < 0 || i2 > i3) {
/* 71 */                StringBuilder sbI0010I0i = IIl001iO0Io.I0010I0i("Start (", i, ") and end (", i2, ") must be in 0..");
/* 77 */                sbI0010I0i.append(this.I00000oOI);
/* 84 */                lO00l0o.I00000oOI(sbI0010I0i.toString());
/* 106 */               throw null;
                    }
/* 14 */            if (i2 < i) {
/* 63 */                lO00l0o.I00000oIO("Start (" + i + ") is more than end (" + i2 + ')');
/* 66 */                throw null;
                    }
/* 16 */            if (i2 != i) {
/* 18 */                if (i2 < i3) {
/* 20 */                    Object[] objArr = this.I00000oIO;
/* 22 */                    I1IoiO1l.I000iOII(objArr, i, objArr, i2, i3);
                        }
/* 25 */                int i4 = this.I00000oOI;
/* 28 */                int i5 = i4 - (i2 - i);
/* 32 */                Arrays.fill(this.I00000oIO, i5, i4, (Object) null);
/* 35 */                this.I00000oOI = i5;
                    }
                }

                public final void I000o00OoI0I(int i, Object[] objArr) {
/* 1 */             int length = objArr.length;
/* 10 */            Object[] objArr2 = new Object[Math.max(i, (length * 3) / 2)];
/* 13 */            System.arraycopy(objArr, 0, objArr2, 0, length);
/* 16 */            this.I00000oIO = objArr2;
                }

                public final Object I000oI1ioi(int i, Object obj) {
/* 1 */             if (i < 0 || i >= this.I00000oOI) {
/* 14 */                I00100l0(i);
/* 37 */                throw null;
                    }
/* 7 */             Object[] objArr = this.I00000oIO;
/* 9 */             Object obj2 = objArr[i];
/* 11 */            objArr[i] = obj;
/* 13 */            return obj2;
                }

                public final void I00100l0(int i) {
/* 5 */             StringBuilder sbI00100o1O0lo = IlIi0I0.I00100o1O0lo("Index ", i, " must be in 0..");
/* 13 */            sbI00100o1O0lo.append(this.I00000oOI - 1);
/* 20 */            lO00l0o.I00000oOI(sbI00100o1O0lo.toString());
/* 29 */            throw null;
                }

                public final boolean equals(Object obj) {
/* 4 */             if (obj instanceof OI0oiiIO0) {
/* 6 */                 OI0oiiIO0 oI0oiiIO0 = (OI0oiiIO0) obj;
/* 8 */                 int i = oI0oiiIO0.I00000oOI;
/* 10 */                int i2 = this.I00000oOI;
/* 12 */                if (i == i2) {
/* 15 */                    Object[] objArr = this.I00000oIO;
/* 17 */                    Object[] objArr2 = oI0oiiIO0.I00000oIO;
/* 19 */                    IooO11l iooO11lI000O01llI0 = lIiioliIlo.I000O01llI0(0, i2);
/* 23 */                    int i3 = iooO11lI000O01llI0.I00iOIl;
/* 25 */                    int i4 = iooO11lI000O01llI0.I00iiI;
/* 27 */                    if (i3 > i4) {
/* 45 */                        return true;
                            }
/* 37 */                    while (O0000Ioio00.I0000O(objArr[i3], objArr2[i3])) {
/* 40 */                        if (i3 == i4) {
/* 45 */                            return true;
                                }
/* 42 */                        i3++;
                            }
/* 3 */                     return false;
                        }
                    }
/* 3 */             return false;
                }

                public final int hashCode() {
/* 1 */             Object[] objArr = this.I00000oIO;
/* 3 */             int i = this.I00000oOI;
/* 7 */             int iHashCode = 0;
/* 8 */             for (int i2 = 0; i2 < i; i2++) {
/* 10 */                Object obj = objArr[i2];
/* 22 */                iHashCode += (obj != null ? obj.hashCode() : 0) * 31;
                    }
/* 55 */            return iHashCode;
                }

                public final String toString() {
/* 4 */             I10iOo0il1 i10iOo0il1 = new I10iOo0il1(this, 6);
/* 11 */            StringBuilder sb = new StringBuilder("[");
/* 14 */            Object[] objArr = this.I00000oIO;
/* 16 */            int i = this.I00000oOI;
/* 18 */            int i2 = 0;
                    while (true) {
/* 19 */                if (i2 >= i) {
/* 53 */                    sb.append((CharSequence) "]");
                            break;
                        }
/* 21 */                Object obj = objArr[i2];
/* 24 */                if (i2 == -1) {
/* 28 */                    sb.append((CharSequence) "...");
                            break;
                        }
/* 32 */                if (i2 != 0) {
/* 36 */                    sb.append((CharSequence) ", ");
                        }
/* 45 */                sb.append((CharSequence) i10iOo0il1.invoke(obj));
/* 48 */                i2++;
                    }
/* 56 */            return sb.toString();
                }

/* 13 */        public OI0oiiIO0() {
/* 14 */            this(16);
                }
            }
