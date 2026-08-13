            package p000;
            
            public abstract class lOi10iiOi {
                public static final void I00000oIO(Oi0iOio oi0iOio, float f, long j) {
/* 28 */            float fCeil = Iil1010O.I0000Il00O(f, Float.NaN) ? 0.0f : Iil1010O.I0000Il00O(f, 0.0f) ? 1.0f : (float) Math.ceil(f * oi0iOio.I00iOIl);
/* 35 */            oi0iOio.I000II((byte) 8, oi0iOio.I00ll1, oi0iOio.I00lli11);
/* 38 */            Oli100iIoOOO oli100iIoOOO = oi0iOio.I00iiO;
/* 40 */            if (oli100iIoOOO != null) {
                        oli100iIoOOO.I00000oIO |= 256;
/* 49 */                oli100iIoOOO.I000iOII = fCeil;
                    }
/* 57 */            oi0iOio.I000II((byte) 35, oi0iOio.I00ll1, oi0iOio.I00lli11);
/* 60 */            I110IiI0o1Il i110IiI0o1Il = oi0iOio.I00ll1;
/* 62 */            I110IiI0o1Il i110IiI0o1Il2 = oi0iOio.I00lli11;
/* 67 */            OoioI1Io10oo ooioI1Io10oo = OoioI1Io10oo.I00000oIO;
/* 69 */            if (i110IiI0o1Il == ooioI1Io10oo) {
/* 75 */                if ((oi0iOio.I00li1OI & 1) != 0) {
/* 77 */                    OI0l1oli1I oI0l1oli1I = oi0iOio.I00io1l;
/* 79 */                    if (oI0l1oli1I == null || (i110IiI0o1Il = (I110IiI0o1Il) oI0l1oli1I.I00000oOI(50)) == null) {
/* 89 */                        i110IiI0o1Il = Oi0iiI.I00000oIO;
                            }
                        } else {
/* 92 */                    i110IiI0o1Il = null;
                        }
                    }
/* 93 */            if (i110IiI0o1Il2 == ooioI1Io10oo) {
/* 99 */                if ((oi0iOio.I00li1OI & 1) != 0) {
/* 101 */                   OI0l1oli1I oI0l1oli1I2 = oi0iOio.I00ioIO;
/* 103 */                   if (oI0l1oli1I2 == null || (i110IiI0o1Il2 = (I110IiI0o1Il) oI0l1oli1I2.I00000oOI(50)) == null) {
/* 113 */                       i110IiI0o1Il2 = Oi0iiI.I00000oIO;
                            }
                        } else {
/* 116 */                   i110IiI0o1Il2 = null;
                        }
                    }
/* 130 */           oi0iOio.I00li1OI = (i110IiI0o1Il == null || i110IiI0o1Il2 == null) ? oi0iOio.I00li1OI & (-2) : oi0iOio.I00li1OI | 1;
/* 132 */           oi0iOio.I000O01llI0(50, i110IiI0o1Il, i110IiI0o1Il2);
/* 135 */           Oli100iIoOOO oli100iIoOOO2 = oi0iOio.I00iiO;
/* 137 */           if (oli100iIoOOO2 != null) {
/* 139 */               oli100iIoOOO2.I0000O(j);
                    }
                }
            }
