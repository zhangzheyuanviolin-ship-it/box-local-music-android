            package p000;

            import android.view.View;
            import android.view.ViewGroup;
            import java.lang.invoke.VarHandle;
            import java.util.Iterator;
            
/* 8 */     public class I01I0Iioooo0 implements Iterator, O0IlIoi {
                public final int I00iOIl;
                public int I00iiI;
                public Object I00iiO;

                public I01I0Iioooo0(I01IO0oio i01IO0oio) {
/* 2 */             this.I00iOIl = 0;
/* 7 */             this.I00iiO = i01IO0oio;
                }

                @Override
                public final boolean hasNext() {
                    switch (this.I00iOIl) {
                        case 0:
/* 107 */                   if (this.I00iiI < ((I01IO0oio) this.I00iiO).I00000oOI()) {
                                break;
                            }
                            break;
                        case 1:
/* 93 */                    if (this.I00iiI < ((Object[]) this.I00iiO).length) {
                                break;
                            }
                            break;
                        case 2:
/* 82 */                    if (this.I00iiI > 0) {
                                break;
                            }
                            break;
                        case 3:
/* 76 */                    if (this.I00iiI < ((OlIIioolI) this.I00iiO).I0000O()) {
                                break;
                            }
                            break;
                        case 4:
/* 62 */                    if (this.I00iiI < ((byte[]) this.I00iiO).length) {
                                break;
                            }
                            break;
                        case 5:
/* 51 */                    if (this.I00iiI < ((int[]) this.I00iiO).length) {
                                break;
                            }
                            break;
                        case 6:
/* 40 */                    if (this.I00iiI < ((long[]) this.I00iiO).length) {
                                break;
                            }
                            break;
                        case 7:
/* 29 */                    if (this.I00iiI < ((short[]) this.I00iiO).length) {
                                break;
                            }
                            break;
                        default:
/* 18 */                    if (this.I00iiI < ((ViewGroup) this.I00iiO).getChildCount()) {
                                break;
                            }
                            break;
                    }
/* 4 */             return true;
                }

                @Override
                public final Object next() {
                    switch (this.I00iOIl) {
                        case 0:
/* 224 */                   if (!hasNext()) {
/* 241 */                       IoOOl0iOl1io.I00000oOI();
                                break;
                            } else {
/* 228 */                       I01IO0oio i01IO0oio = (I01IO0oio) this.I00iiO;
/* 230 */                       int i = this.I00iiI;
/* 234 */                       this.I00iiI = i + 1;
                                break;
                            }
                        case 1:
                            try {
/* 194 */                       Object[] objArr = (Object[]) this.I00iiO;
/* 196 */                       int i2 = this.I00iiI;
/* 200 */                       this.I00iiI = i2 + 1;
                                break;
                            } catch (ArrayIndexOutOfBoundsException e) {
                                this.I00iiI--;
/* 216 */                       OIiilo1Ool0o.I000II(e.getMessage());
/* 3 */                         return null;
                            }
                        case 2:
/* 176 */                   Il0lIiOiO1i il0lIiOiO1i = (Il0lIiOiO1i) this.I00iiO;
/* 178 */                   int i3 = il0lIiOiO1i.I0000Il00O;
/* 180 */                   int i4 = this.I00iiI;
/* 184 */                   this.I00iiI = i4 - 1;
                            break;
                        case 3:
/* 161 */                   OlIIioolI olIIioolI = (OlIIioolI) this.I00iiO;
/* 163 */                   int i5 = this.I00iiI;
/* 167 */                   this.I00iiI = i5 + 1;
                            break;
                        case 4:
/* 125 */                   int i6 = this.I00iiI;
/* 129 */                   byte[] bArr = (byte[]) this.I00iiO;
/* 132 */                   if (i6 >= bArr.length) {
/* 155 */                       OIiilo1Ool0o.I000II(String.valueOf(i6));
                                break;
                            } else {
/* 136 */                       this.I00iiI = i6 + 1;
/* 138 */                       byte b = bArr[i6];
/* 142 */                       OoOoil0I ooOoil0I = new OoOoil0I();
/* 145 */                       ooOoil0I.I00iOIl = b;
/* 147 */                       VarHandle.storeStoreFence();
                                break;
                            }
                        case 5:
/* 91 */                    int i7 = this.I00iiI;
/* 95 */                    int[] iArr = (int[]) this.I00iiO;
/* 98 */                    if (i7 >= iArr.length) {
/* 121 */                       OIiilo1Ool0o.I000II(String.valueOf(i7));
                                break;
                            } else {
/* 102 */                       this.I00iiI = i7 + 1;
/* 104 */                       int i8 = iArr[i7];
/* 108 */                       Ooi01Oi0II ooi01Oi0II = new Ooi01Oi0II();
/* 111 */                       ooi01Oi0II.I00iOIl = i8;
/* 113 */                       VarHandle.storeStoreFence();
                                break;
                            }
                        case 6:
/* 63 */                    int i9 = this.I00iiI;
/* 67 */                    long[] jArr = (long[]) this.I00iiO;
/* 70 */                    if (i9 >= jArr.length) {
/* 87 */                        OIiilo1Ool0o.I000II(String.valueOf(i9));
                                break;
                            } else {
/* 74 */                        this.I00iiI = i9 + 1;
                                break;
                            }
                        case 7:
/* 29 */                    int i10 = this.I00iiI;
/* 33 */                    short[] sArr = (short[]) this.I00iiO;
/* 36 */                    if (i10 >= sArr.length) {
/* 59 */                        OIiilo1Ool0o.I000II(String.valueOf(i10));
                                break;
                            } else {
/* 40 */                        this.I00iiI = i10 + 1;
/* 42 */                        short s = sArr[i10];
/* 46 */                        Ooi1IIOloiii ooi1IIOloiii = new Ooi1IIOloiii();
/* 49 */                        ooi1IIOloiii.I00iOIl = s;
/* 51 */                        VarHandle.storeStoreFence();
                                break;
                            }
                        default:
/* 9 */                     ViewGroup viewGroup = (ViewGroup) this.I00iiO;
/* 11 */                    int i11 = this.I00iiI;
/* 15 */                    this.I00iiI = i11 + 1;
/* 17 */                    View childAt = viewGroup.getChildAt(i11);
/* 21 */                    if (childAt == null) {
/* 25 */                        OoOil11Ol1o.I001i1lo1io();
                                break;
                            } else {
                                break;
                            }
                    }
/* 3 */             return null;
                }

                @Override
                public final void remove() {
                    switch (this.I00iOIl) {
                        case 0:
/* 69 */                    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                        case 1:
/* 63 */                    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                        case 2:
/* 57 */                    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                        case 3:
/* 51 */                    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                        case 4:
/* 45 */                    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                        case 5:
/* 39 */                    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                        case 6:
/* 33 */                    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                        case 7:
/* 27 */                    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                        default:
/* 10 */                    ViewGroup viewGroup = (ViewGroup) this.I00iiO;
                            int i = this.I00iiI - 1;
/* 16 */                    this.I00iiI = i;
/* 18 */                    viewGroup.removeViewAt(i);
/* 21 */                    return;
                    }
                }

/* 9 */         public I01I0Iioooo0(int i) {
/* 10 */            this.I00iOIl = i;
                }
            }
