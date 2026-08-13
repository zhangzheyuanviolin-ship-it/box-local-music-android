            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Arrays;
            
            public final class Il0lloiOlO implements O0O01001OOII {
                public final Enum[] I00000oIO;
                public Il0lIiOiO1i I00000oOI;
                public final OllO00oiil I0000Il00O;

                public Il0lloiOlO(String str, Enum[] enumArr) {
/* 4 */             this.I00000oIO = enumArr;
/* 10 */            IO1Io1IOOOIi iO1Io1IOOOIi = new IO1Io1IOOOIi(8);
/* 13 */            iO1Io1IOOOIi.I00iiI = this;
/* 15 */            iO1Io1IOOOIi.I00iiO = str;
/* 17 */            VarHandle.storeStoreFence();
/* 25 */            this.I0000Il00O = new OllO00oiil(iO1Io1IOOOIi);
                }

                @Override
                public final Object I00000oOI(Ii1iO1O ii1iO1O) {
/* 5 */             int iI00111O = ii1iO1O.I00111O(I0000O());
/* 9 */             Enum[] enumArr = this.I00000oIO;
/* 11 */            if (iI00111O >= 0 && iI00111O < enumArr.length) {
/* 16 */                return enumArr[iI00111O];
                    }
/* 186 */           throw new Oili1O(iI00111O + " is not among valid " + I0000O().I00000oIO() + " enum values, values size is " + enumArr.length);
                }

                @Override
                public final void I0000Il00O(Il0I1ii il0I1ii, Object obj) {
/* 1 */             Enum r5 = (Enum) obj;
/* 3 */             Enum[] enumArr = this.I00000oIO;
/* 5 */             int iI001l0I00 = I1IoiO1l.I001l0I00(enumArr, r5);
/* 10 */            if (iI001l0I00 != -1) {
/* 16 */                il0I1ii.I0010I0i(I0000O(), iI001l0I00);
/* 19 */                return;
                    }
/* 24 */            StringBuilder sb = new StringBuilder();
/* 27 */            sb.append(r5);
/* 34 */            String strI00000oIO = I0000O().I00000oIO();
/* 38 */            String string = Arrays.toString(enumArr);
/* 44 */            sb.append(" is not a valid enum ");
/* 47 */            sb.append(strI00000oIO);
/* 52 */            sb.append(", must be one of ");
/* 55 */            sb.append(string);
/* 89 */            throw new Oili1O(sb.toString());
                }

                @Override
                public final OilOloI I0000O() {
/* 7 */             return (OilOloI) this.I0000Il00O.getValue();
                }

                public final String toString() {
/* 24 */            return "kotlinx.serialization.internal.EnumSerializer<" + I0000O().I00000oIO() + '>';
                }
            }
