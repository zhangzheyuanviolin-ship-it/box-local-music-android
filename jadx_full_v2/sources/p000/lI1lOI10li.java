            package p000;

            import java.lang.annotation.Annotation;
            
            public abstract class lI1lOI10li {
                public static final void I00000oIO(O011OoiO1 o011OoiO1, O0O01001OOII o0o01001ooii, O0O01001OOII o0o01001ooii2, String str) {
/* 1 */             OilOloI oilOloII0000O = o0o01001ooii2.I0000O();
/* 5 */             O01iI00o.I0000O(o011OoiO1, oilOloII0000O);
/* 16 */            if (iO0IO0O.I00000oIO(oilOloII0000O).contains(str)) {
/* 22 */                String strI00000oIO = o0o01001ooii.I0000O().I00000oIO();
/* 30 */                String strI00000oIO2 = o0o01001ooii2.I0000O().I00000oIO();
/* 82 */                throw new O01Oio10O1l(IIl001iO0Io.I00100l0(IIl001iO0Io.I00111O("Class '", strI00000oIO2, "' cannot be serialized ", (o011OoiO1.I00000oIO.I000O01llI0 == IOIOiIloIi0.I00iiI && O0000Ioio00.I0000O(strI00000oIO, strI00000oIO2)) ? "in ALL_JSON_OBJECTS class discriminator mode" : IIl001iO0Io.I000iOII('\'', "as base class '", strI00000oIO), " because it has property name that conflicts with JSON class discriminator '"), str, "'."), "You can either change class discriminator in JsonConfiguration, or rename property with @SerialName annotation.");
                    }
                }

                public static final void I00000oOI(lO1oIl1ii lo1oil1ii) {
/* 3 */             if (lo1oil1ii instanceof Oili0Il) {
/* 28 */                I000II.I001IO000("Enums cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
                    } else if (lo1oil1ii instanceof OOIOoio0iiI) {
/* 22 */                I000II.I001IO000("Primitives cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
                    } else if (lo1oil1ii instanceof OO1l1i) {
/* 16 */                I000II.I001IO000("Actual serializer for polymorphic cannot be polymorphic itself");
                    }
                }

                public static final String I0000Il00O(O011OoiO1 o011OoiO1, OilOloI oilOloI) {
/* 13 */            for (Annotation annotation : oilOloI.getAnnotations()) {
/* 23 */                if (annotation instanceof O01III1IIII) {
/* 27 */                    return ((O01III1IIII) annotation).discriminator();
                        }
                    }
/* 34 */            return o011OoiO1.I00000oIO.I0001Ioi1lo;
                }
            }
