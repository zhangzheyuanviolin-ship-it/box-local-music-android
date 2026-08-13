            package p000;

            import java.lang.ref.WeakReference;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.UUID;
            
            public final class I1loi0lOloO1 extends OooioIIoi0O {
                public final String I00000oOI = "SaveableStateHolder_BackStackEntryKey";
                public final String I0000Il00O;
                public Oi00IilOloo0 I0000O;

                public I1loi0lOloO1(OiIloOOiiOii oiIloOOiiOii) {
                    Object value;
/* 8 */             I1ii1o0 i1ii1o0 = oiIloOOiiOii.I00000oOI;
/* 12 */            LinkedHashMap linkedHashMap = (LinkedHashMap) i1ii1o0.I00iiI;
/* 16 */            LinkedHashMap linkedHashMap2 = (LinkedHashMap) i1ii1o0.I00ilI0I1;
                    try {
/* 23 */                OlO0OIIl1 olO0OIIl1 = (OlO0OIIl1) linkedHashMap2.get("SaveableStateHolder_BackStackEntryKey");
/* 25 */                if (olO0OIIl1 == null || (value = olO0OIIl1.getValue()) == null) {
/* 33 */                    value = linkedHashMap.get("SaveableStateHolder_BackStackEntryKey");
                        }
                    } catch (ClassCastException unused) {
/* 38 */                linkedHashMap.remove("SaveableStateHolder_BackStackEntryKey");
/* 45 */                ((LinkedHashMap) i1ii1o0.I00iio).remove("SaveableStateHolder_BackStackEntryKey");
/* 48 */                linkedHashMap2.remove("SaveableStateHolder_BackStackEntryKey");
/* 51 */                value = null;
                    }
/* 52 */            String string = (String) value;
/* 54 */            if (string == null) {
/* 60 */                string = UUID.randomUUID().toString();
/* 64 */                String str = this.I00000oOI;
/* 66 */                if (string != null) {
/* 68 */                    ArrayList arrayList = OiIo1l1io.I00000oIO;
/* 70 */                    if (arrayList == null || !arrayList.isEmpty()) {
/* 78 */                        Iterator it = arrayList.iterator();
/* 86 */                        while (it.hasNext()) {
/* 98 */                            if (((Class) it.next()).isInstance(string)) {
                                    }
                                }
                            }
/* 109 */                   OIiilo1Ool0o.I0010o(string.getClass(), "Can't put value with type ", " into saved state");
/* 112 */                   throw null;
                        }
/* 113 */               ArrayList arrayList2 = OiIo1l1io.I00000oIO;
/* 117 */               Object obj = oiIloOOiiOii.I00000oIO.get(str);
/* 126 */               OI0lOii0I oI0lOii0I = obj instanceof OI0lOii0I ? (OI0lOii0I) obj : null;
/* 128 */               if (oI0lOii0I != null) {
/* 130 */                   oI0lOii0I.I000iOII(string);
                        }
/* 135 */               oiIloOOiiOii.I00000oOI.I00IoIO0lI(str, string);
                    }
/* 138 */           this.I0000Il00O = string;
                }

                @Override
                public final void I0000O() {
/* 1 */             Oi00IilOloo0 oi00IilOloo0 = this.I0000O;
/* 6 */             if (oi00IilOloo0 == null) {
/* 41 */                O0000Ioio00.I000OOo1O("saveableStateHolderRef");
/* 55 */                throw null;
                    }
/* 16 */            OiIii0 oiIii0 = (OiIii0) ((WeakReference) oi00IilOloo0.I00iOIl).get();
/* 18 */            if (oiIii0 != null) {
/* 22 */                oiIii0.I0001Ioi1lo(this.I0000Il00O);
                    }
/* 25 */            Oi00IilOloo0 oi00IilOloo02 = this.I0000O;
/* 27 */            if (oi00IilOloo02 != null) {
/* 33 */                ((WeakReference) oi00IilOloo02.I00iOIl).clear();
                    } else {
/* 37 */                O0000Ioio00.I000OOo1O("saveableStateHolderRef");
/* 40 */                throw null;
                    }
                }
            }
