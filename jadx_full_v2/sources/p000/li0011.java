            package p000;
            
            public abstract class li0011 {
                public static final Object I00000oIO(OiOOI1I1I101 oiOOI1I1I101, boolean z, Object obj, IlliIl1l11O illiIl1l11O) {
                    Object iOiIII1I;
                    Object objI00OI1;
                    try {
/* 4 */                 if (illiIl1l11O instanceof I1oI1lil) {
/* 16 */                    OoOOI1100oI0.I0000Il00O(2, illiIl1l11O);
/* 19 */                    iOiIII1I = illiIl1l11O.invoke(obj, oiOOI1I1I101);
                        } else {
/* 6 */                     iOiIII1I = l00iIoI.I0000O(illiIl1l11O, obj, oiOOI1I1I101);
                        }
                    } catch (IiiI1OOll0l1 e) {
/* 90 */                Throwable th = e.I00iOIl;
/* 95 */                oiOOI1I1I101.I00O10llo(new IOiIII1I(false, th));
/* 483 */               throw th;
                    } catch (Throwable th2) {
/* 26 */                iOiIII1I = new IOiIII1I(false, th2);
                    }
/* 30 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 32 */            if (iOiIII1I == ii0111o || (objI00OI1 = oiOOI1I1I101.I00OI1(iOiIII1I)) == O011OiI01.I00000oOI) {
/* 43 */                return ii0111o;
                    }
/* 44 */            oiOOI1I1I101.I00iio();
/* 49 */            if (!(objI00OI1 instanceof IOiIII1I)) {
/* 83 */                return O011OiI01.I00000oIO(objI00OI1);
                    }
/* 51 */            if (!z) {
/* 56 */                Throwable th3 = ((IOiIII1I) objI00OI1).I00000oIO;
/* 60 */                if ((th3 instanceof Oo11Oo) && ((Oo11Oo) th3).I00iOIl == oiOOI1I1I101) {
/* 70 */                    if (iOiIII1I instanceof IOiIII1I) {
/* 77 */                        throw ((IOiIII1I) iOiIII1I).I00000oIO;
                            }
/* 87 */                    return iOiIII1I;
                        }
                    }
/* 82 */            throw ((IOiIII1I) objI00OI1).I00000oIO;
                }
            }
