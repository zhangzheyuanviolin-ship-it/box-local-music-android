            package p000;

            import android.os.Bundle;
            import android.os.Parcel;
            import android.os.Parcelable;
            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            import java.util.Iterator;
            
            public final class il1O0O01 extends I01OlIoIl {
                public static final Parcelable.Creator<il1O0O01> CREATOR;
                public String I00iOIl;
                public Bundle I00iiI;
                public transient lOliil I00iiO;

                static {
/* 1 */             loliio1il loliio1ilVarI00000oOI = iiooOolI1.I00000oOI();
/* 7 */             loliio1ilVarI00000oOI.I000o00OoI0I = "FunctionCall";
/* 10 */            loliio1ilVarI00000oOI.I00000oIO(6);
/* 15 */            loliio1ilVarI00000oOI.I0000Il00O = "The function call schema";
/* 17 */            loliio1il loliio1ilVarI00000oOI2 = iiooOolI1.I00000oOI();
/* 22 */            loliio1ilVarI00000oOI2.I00000oIO(1);
/* 27 */            loliio1ilVarI00000oOI2.I0000Il00O = "The function name";
/* 29 */            iiooOolI1 iiooooli1I00000oOI = loliio1ilVarI00000oOI2.I00000oOI();
/* 33 */            loliio1il loliio1ilVarI00000oOI3 = iiooOolI1.I00000oOI();
/* 38 */            loliio1ilVarI00000oOI3.I00000oIO(5);
/* 43 */            loliio1ilVarI00000oOI3.I0000Il00O = "An array of function arguments in an OBJECT format, e.g. [{'argName': 'argName1', 'argValue': 'argValue1'}, {'argName': 'argName2', 'argValue': 123.0}]";
/* 45 */            loliio1il loliio1ilVarI00000oOI4 = iiooOolI1.I00000oOI();
/* 49 */            loliio1ilVarI00000oOI4.I00000oIO(6);
/* 54 */            loliio1ilVarI00000oOI4.I0000Il00O = "The function argument root schema, which contains the argument name and its value.";
/* 56 */            loliio1il loliio1ilVarI00000oOI5 = iiooOolI1.I00000oOI();
/* 60 */            loliio1ilVarI00000oOI5.I00000oIO(1);
/* 65 */            loliio1ilVarI00000oOI5.I0000Il00O = "The argument name";
/* 67 */            iiooOolI1 iiooooli1I00000oOI2 = loliio1ilVarI00000oOI5.I00000oOI();
/* 71 */            iiooOolI1 iiooooli1 = il0olIi.I00ioIO;
/* 75 */            ll0iOo11011i.I00000oIO("argValue", iiooooli1);
/* 90 */            loliio1ilVarI00000oOI4.I000oI1ioi = lOliil.I0000Il00O(2, new Object[]{"argName", iiooooli1I00000oOI2, "argValue", iiooooli1}, null);
/* 92 */            Object[] objArr = {"argName", "argValue"};
/* 96 */            ll0lIii.I00000oIO(2, objArr);
/* 103 */           loliio1ilVarI00000oOI4.I000lI = lOI1lll1l10.I000oI1ioi(2, objArr);
/* 105 */           Object[] objArr2 = {"argName", "argValue"};
/* 109 */           ll0lIii.I00000oIO(2, objArr2);
/* 116 */           loliio1ilVarI00000oOI4.I000OOo1O = lOI1lll1l10.I000oI1ioi(2, objArr2);
/* 122 */           loliio1ilVarI00000oOI3.I0001Ioi1lo = loliio1ilVarI00000oOI4.I00000oOI();
/* 140 */           loliio1ilVarI00000oOI.I000oI1ioi = lOliil.I0000Il00O(2, new Object[]{"name", iiooooli1I00000oOI, "args", loliio1ilVarI00000oOI3.I00000oOI()}, null);
/* 142 */           Object[] objArr3 = {"name", "args"};
/* 146 */           ll0lIii.I00000oIO(2, objArr3);
/* 153 */           loliio1ilVarI00000oOI.I000lI = lOI1lll1l10.I000oI1ioi(2, objArr3);
/* 155 */           Object[] objArr4 = {"name", "args"};
/* 159 */           ll0lIii.I00000oIO(2, objArr4);
/* 166 */           loliio1ilVarI00000oOI.I000OOo1O = lOI1lll1l10.I000oI1ioi(2, objArr4);
/* 168 */           loliio1ilVarI00000oOI.I00000oOI();
/* 178 */           CREATOR = new iiiilIIoIi(19);
                }

                public final lOliil I00000oOI() {
                    Bundle bundle;
/* 1 */             lOliil loliil = this.I00iiO;
/* 3 */             if (loliil != null || (bundle = this.I00iiI) == null) {
/* 110 */               return loliil;
                    }
/* 14 */            I00Ol00 i00Ol00 = new I00Ol00(4, 22);
/* 29 */            for (String str : bundle.keySet()) {
/* 37 */                Parcelable.Creator<il0olIi> creator = il0olIi.CREATOR;
/* 39 */                byte[] byteArray = bundle.getByteArray(str);
/* 43 */                byteArray.getClass();
/* 46 */                Parcel parcelObtain = Parcel.obtain();
                        try {
/* 52 */                    parcelObtain.unmarshall(byteArray, 0, byteArray.length);
/* 55 */                    parcelObtain.setDataPosition(0);
/* 58 */                    il0olIi il0oliiCreateFromParcel = creator.createFromParcel(parcelObtain);
/* 64 */                    parcelObtain.recycle();
/* 67 */                    il0olIi il0olii = il0oliiCreateFromParcel;
/* 69 */                    if (il0olii != null) {
/* 71 */                        i00Ol00.I001iOo1i0O(str, il0olii);
                            }
                        } catch (Throwable th) {
/* 76 */                    parcelObtain.recycle();
/* 79 */                    throw th;
                        }
                    }
/* 80 */            lOliil loliilI001lllioOl = i00Ol00.I001lllioOl();
/* 84 */            this.I00iiO = loliilI001lllioOl;
/* 110 */           return loliilI001lllioOl;
                }

                public final String toString() {
/* 1 */             String str = this.I00iOIl;
/* 3 */             lOliil loliilI00000oOI = I00000oOI();
/* 7 */             if (loliilI00000oOI == null || loliilI00000oOI.isEmpty()) {
/* 94 */                return String.valueOf(str).concat("()");
                    }
/* 19 */            IliIlOOIoIo iliIlOOIoIo = new IliIlOOIoIo(3);
/* 24 */            iliIlOOIoIo.I00iiI = ", ";
/* 26 */            VarHandle.storeStoreFence();
/* 35 */            Iterator it = ((lOlIO0oi) loliilI00000oOI.entrySet()).iterator();
/* 41 */            StringBuilder sb = new StringBuilder();
                    try {
/* 44 */                ll0OiOlIilO.I00000oIO(sb, it, iliIlOOIoIo);
/* 47 */                String string = sb.toString();
/* 77 */                return IIl001iO0Io.I00100o1O0lo(new StringBuilder(string.length() + String.valueOf(str).length() + 1 + 1), str, "(", string, ")");
                    } catch (IOException e) {
/* 83 */                I000II.I000O01llI0(e);
/* 86 */                return null;
                    }
                }

                @Override
                public final void writeToParcel(Parcel parcel, int i) {
/* 1 */             String str = this.I00iOIl;
/* 5 */             int iI00100l0 = lO0IioIooIl.I00100l0(20293, parcel);
/* 10 */            lO0IioIooIl.I000OiO(parcel, 1, str);
/* 16 */            lO0IioIooIl.I00000oIO(parcel, 2, this.I00iiI);
/* 19 */            lO0IioIooIl.I00100o1O0lo(iI00100l0, parcel);
                }
            }
