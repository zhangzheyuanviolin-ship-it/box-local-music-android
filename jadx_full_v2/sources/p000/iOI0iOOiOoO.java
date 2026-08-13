            package p000;
            
            public abstract class iOI0iOOiOoO {
                public static final void I00000oIO(O0IOli0o0 o0IOli0o0, String str) {
                    String string;
/* 20 */            String str2 = "in the polymorphic scope of '" + o0IOli0o0.I000oI1ioi() + '\'';
/* 26 */            if (str == null) {
/* 32 */                string = IIl001iO0Io.I000iOII('.', "Class discriminator was missing and no default serializers were registered ", str2);
                    } else {
/* 43 */                StringBuilder sbI00111O = IIl001iO0Io.I00111O("Serializer for subclass '", str, "' is not found ", str2, ".\nCheck if class with serial name '");
/* 51 */                IIl001iO0Io.I001lIiIIo1O(sbI00111O, str, "' exists and serializer is registered in a corresponding SerializersModule.\nTo be registered automatically, class '", str, "' has to be '@Serializable', and the base class '");
/* 58 */                sbI00111O.append(o0IOli0o0.I000oI1ioi());
/* 63 */                sbI00111O.append("' has to be sealed and '@Serializable'.");
/* 66 */                string = sbI00111O.toString();
                    }
/* 89 */            throw new Oili1O(string);
                }
            }
