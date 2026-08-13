            package p000;

            import android.view.autofill.AutofillValue;
            import kotlin.jvm.functions.Function1;
            
            public final class IOI0oo implements Function1 {
                public final int I00iOIl;
                public Oil0O0I I00iiI;

                public IOI0oo(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object invoke(Object obj) throws Exception {
                    Boolean boolValueOf;
/* 1 */             int i = this.I00iOIl;
/* 3 */             boolean z = false;
/* 6 */             Oil0O0I oil0O0I = this.I00iiI;
                    switch (i) {
                        case 0:
/* 93 */                    OO010O1i1001 oO010O1i1001 = (OO010O1i1001) ((OoIOloiIii) obj);
/* 95 */                    oO010O1i1001.I00o0l1o1o0 = true;
/* 99 */                    oO010O1i1001.I00o0iI0io1.invoke(oil0O0I);
/* 102 */                   lO1OiIiIo0oi.I00000oOI(oO010O1i1001);
/* 105 */                   return Boolean.FALSE;
                        case 1:
/* 53 */                    AutofillValue autofillValue = ((I0oI0oiiI1) obj).I00000oIO;
/* 65 */                    boolValueOf = autofillValue.isToggle() ? Boolean.valueOf(autofillValue.getToggleValue()) : null;
/* 69 */                    if (boolValueOf != null) {
/* 82 */                        Oil0Io.I000l1(oil0O0I, boolValueOf.booleanValue() ? Oo1IiOO1IoI.I00iOIl : Oo1IiOO1IoI.I00iiI);
/* 85 */                        z = true;
                            }
/* 86 */                    return Boolean.valueOf(z);
                        default:
/* 13 */                    AutofillValue autofillValue2 = ((I0oI0oiiI1) obj).I00000oIO;
/* 25 */                    boolValueOf = autofillValue2.isToggle() ? Boolean.valueOf(autofillValue2.getToggleValue()) : null;
/* 29 */                    if (boolValueOf != null) {
/* 42 */                        Oil0Io.I000l1(oil0O0I, boolValueOf.booleanValue() ? Oo1IiOO1IoI.I00iOIl : Oo1IiOO1IoI.I00iiI);
/* 45 */                        z = true;
                            }
/* 46 */                    return Boolean.valueOf(z);
                    }
                }
            }
