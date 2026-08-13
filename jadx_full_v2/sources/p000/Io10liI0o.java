            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.List;
            import kotlin.jvm.functions.Function1;
            
            public final class Io10liI0o extends Oolo0Oli0lOo {
                public float[] I00000oOI;
                public final ArrayList I0000Il00O = new ArrayList();
                public boolean I0000O = true;
                public long I0000oI00 = IOOiio0i.I000o00OoI0I;
                public List I0001Ioi1lo;
                public boolean I000II;
                public I0ol0lI I000O01llI0;
                public Function1 I000OOo1O;
                public final Iil1olo I000OiO;
                public String I000iOII;
                public float I000l1;
                public float I000lI;
                public float I000o00OoI0I;
                public float I000oI1ioi;
                public float I00100l0;
                public float I00100o1O0lo;
                public float I0010I0i;
                public boolean I0010o;

                public Io10liI0o() {
/* 18 */            int i = Ooo1iOO.I00000oIO;
/* 22 */            this.I0001Ioi1lo = Il01100l.I00iOIl;
/* 24 */            this.I000II = true;
/* 30 */            Iil1olo iil1olo = new Iil1olo(19);
/* 33 */            iil1olo.I00iiI = this;
/* 35 */            VarHandle.storeStoreFence();
/* 38 */            this.I000OiO = iil1olo;
/* 42 */            this.I000iOII = "";
/* 46 */            this.I000oI1ioi = 1.0f;
/* 48 */            this.I00100l0 = 1.0f;
/* 50 */            this.I0010o = true;
                }

                @Override
                public final void I00000oIO(IilloIOOO0i iilloIOOO0i) {
/* 6 */             if (this.I0010o) {
/* 8 */                 float[] fArrI00000oOI = this.I00000oOI;
/* 10 */                if (fArrI00000oOI == null) {
/* 12 */                    fArrI00000oOI = O1i010l1l.I00000oOI();
/* 16 */                    this.I00000oOI = fArrI00000oOI;
                        } else {
/* 19 */                    O1i010l1l.I0000oI00(fArrI00000oOI);
                        }
/* 32 */                O1i010l1l.I000O01llI0(fArrI00000oOI, this.I00100o1O0lo + this.I000lI, this.I0010I0i + this.I000o00OoI0I);
/* 35 */                float f = this.I000l1;
/* 40 */                if (fArrI00000oOI.length >= 16) {
/* 49 */                    double d = f * 0.017453292519943295d;
/* 54 */                    float fSin = (float) Math.sin(d);
/* 59 */                    float fCos = (float) Math.cos(d);
/* 60 */                    float f2 = fArrI00000oOI[0];
/* 63 */                    float f3 = fArrI00000oOI[4];
/* 69 */                    float f4 = (fSin * f3) + (fCos * f2);
/* 70 */                    float f5 = -fSin;
/* 75 */                    float f6 = fArrI00000oOI[1];
/* 78 */                    float f7 = fArrI00000oOI[5];
/* 84 */                    float f8 = (fSin * f7) + (fCos * f6);
/* 89 */                    float f9 = fArrI00000oOI[2];
/* 92 */                    float f10 = fArrI00000oOI[6];
/* 98 */                    float f11 = (fSin * f10) + (fCos * f9);
/* 106 */                   float f12 = fArrI00000oOI[3];
/* 110 */                   float f13 = fArrI00000oOI[7];
/* 123 */                   fArrI00000oOI[0] = f4;
/* 125 */                   fArrI00000oOI[1] = f8;
/* 127 */                   fArrI00000oOI[2] = f11;
/* 129 */                   fArrI00000oOI[3] = (fSin * f13) + (fCos * f12);
/* 131 */                   fArrI00000oOI[4] = (f3 * fCos) + (f2 * f5);
/* 133 */                   fArrI00000oOI[5] = (f7 * fCos) + (f6 * f5);
/* 135 */                   fArrI00000oOI[6] = (f10 * fCos) + (f9 * f5);
/* 137 */                   fArrI00000oOI[7] = (fCos * f13) + (f5 * f12);
                        }
/* 143 */               O1i010l1l.I0001Ioi1lo(fArrI00000oOI, this.I000oI1ioi, this.I00100l0);
/* 152 */               O1i010l1l.I000O01llI0(fArrI00000oOI, -this.I000lI, -this.I000o00OoI0I);
/* 155 */               this.I0010o = false;
                    }
/* 159 */           if (this.I000II) {
/* 169 */               if (!this.I0001Ioi1lo.isEmpty()) {
/* 171 */                   I0ol0lI i0ol0lII00000oIO = this.I000O01llI0;
/* 173 */                   if (i0ol0lII00000oIO == null) {
/* 175 */                       i0ol0lII00000oIO = I0olIlI11.I00000oIO();
/* 179 */                       this.I000O01llI0 = i0ol0lII00000oIO;
                            }
/* 183 */                   lI0000o0l.I00000oOI(this.I0001Ioi1lo, i0ol0lII00000oIO);
                        }
/* 186 */               this.I000II = false;
                    }
/* 188 */           IOO000ilo iOO000iloI00iiI = iilloIOOO0i.I00iiI();
/* 192 */           long jI001iOo1i0O = iOO000iloI00iiI.I001iOo1i0O();
/* 200 */           iOO000iloI00iiI.I0010o().I000II();
                    try {
/* 205 */               IIOOoll iIOOoll = (IIOOoll) iOO000iloI00iiI.I00iiI;
/* 207 */               float[] fArr = this.I00000oOI;
/* 209 */               if (fArr != null) {
/* 225 */                   ((IOO000ilo) iIOOoll.I00iiI).I0010o().I000iOII(O1i010l1l.I00000oIO(fArr).I00000oIO);
                        }
/* 231 */               I0ol0lI i0ol0lI = this.I000O01llI0;
/* 241 */               if (!this.I0001Ioi1lo.isEmpty() && i0ol0lI != null) {
/* 253 */                   ((IOO000ilo) iIOOoll.I00iiI).I0010o().I000l1(i0ol0lI);
                        }
/* 256 */               ArrayList arrayList = this.I0000Il00O;
/* 258 */               int size = arrayList.size();
/* 262 */               for (int i = 0; i < size; i++) {
/* 272 */                   ((Oolo0Oli0lOo) arrayList.get(i)).I00000oIO(iilloIOOO0i);
                        }
/* 278 */               IIlIOloOOO.I001IO000(iOO000iloI00iiI, jI001iOo1i0O);
                    } catch (Throwable th) {
/* 282 */               IIlIOloOOO.I001IO000(iOO000iloI00iiI, jI001iOo1i0O);
/* 437 */               throw th;
                    }
                }

                @Override
                public final Function1 I00000oOI() {
/* 1 */             return this.I000OOo1O;
                }

                @Override
                public final void I0000O(Iil1olo iil1olo) {
/* 1 */             this.I000OOo1O = iil1olo;
                }

                public final void I0000oI00(int i, Oolo0Oli0lOo oolo0Oli0lOo) {
/* 1 */             ArrayList arrayList = this.I0000Il00O;
/* 7 */             if (i < arrayList.size()) {
/* 9 */                 arrayList.set(i, oolo0Oli0lOo);
                    } else {
/* 13 */                arrayList.add(oolo0Oli0lOo);
                    }
/* 16 */            I000II(oolo0Oli0lOo);
/* 21 */            oolo0Oli0lOo.I0000O(this.I000OiO);
/* 24 */            I0000Il00O();
                }

                public final void I0001Ioi1lo(long j) {
/* 3 */             if (this.I0000O && j != 16) {
/* 12 */                long j2 = this.I0000oI00;
/* 16 */                if (j2 == 16) {
/* 18 */                    this.I0000oI00 = j;
/* 20 */                    return;
                        }
/* 21 */                int i = Ooo1iOO.I00000oIO;
/* 33 */                if (IOOiio0i.I000O01llI0(j2) == IOOiio0i.I000O01llI0(j) && IOOiio0i.I000II(j2) == IOOiio0i.I000II(j) && IOOiio0i.I0000oI00(j2) == IOOiio0i.I0000oI00(j)) {
/* 77 */                    return;
                        }
/* 61 */                this.I0000O = false;
/* 65 */                this.I0000oI00 = IOOiio0i.I000o00OoI0I;
                    }
                }

                public final void I000II(Oolo0Oli0lOo oolo0Oli0lOo) {
/* 4 */             if (!(oolo0Oli0lOo instanceof OO0IiiI1OII)) {
/* 65 */                if (oolo0Oli0lOo instanceof Io10liI0o) {
/* 67 */                    Io10liI0o io10liI0o = (Io10liI0o) oolo0Oli0lOo;
/* 71 */                    if (io10liI0o.I0000O && this.I0000O) {
/* 79 */                        I0001Ioi1lo(io10liI0o.I0000oI00);
/* 82 */                        return;
                            } else {
/* 83 */                        this.I0000O = false;
/* 87 */                        this.I0000oI00 = IOOiio0i.I000o00OoI0I;
/* 168 */                       return;
                            }
                        }
/* 168 */               return;
                    }
/* 6 */             OO0IiiI1OII oO0IiiI1OII = (OO0IiiI1OII) oolo0Oli0lOo;
/* 8 */             III11l1I iII11l1I = oO0IiiI1OII.I00000oOI;
/* 12 */            if (this.I0000O && iII11l1I != null) {
/* 19 */                if (iII11l1I instanceof OlI00IIlOO) {
/* 25 */                    I0001Ioi1lo(((OlI00IIlOO) iII11l1I).I00000oIO);
                        } else {
/* 29 */                    this.I0000O = false;
/* 33 */                    this.I0000oI00 = IOOiio0i.I000o00OoI0I;
                        }
                    }
/* 35 */            III11l1I iII11l1I2 = oO0IiiI1OII.I000II;
/* 39 */            if (this.I0000O && iII11l1I2 != null) {
/* 46 */                if (iII11l1I2 instanceof OlI00IIlOO) {
/* 52 */                    I0001Ioi1lo(((OlI00IIlOO) iII11l1I2).I00000oIO);
                        } else {
/* 56 */                    this.I0000O = false;
/* 60 */                    this.I0000oI00 = IOOiio0i.I000o00OoI0I;
                        }
                    }
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("VGroup: ");
/* 10 */            sb.append(this.I000iOII);
/* 13 */            ArrayList arrayList = this.I0000Il00O;
/* 15 */            int size = arrayList.size();
/* 20 */            for (int i = 0; i < size; i++) {
/* 26 */                Oolo0Oli0lOo oolo0Oli0lOo = (Oolo0Oli0lOo) arrayList.get(i);
/* 30 */                sb.append("\t");
/* 37 */                sb.append(oolo0Oli0lOo.toString());
/* 42 */                sb.append("\n");
                    }
/* 48 */            return sb.toString();
                }
            }
