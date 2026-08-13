            package p000;

            import java.lang.annotation.Annotation;
            import java.lang.reflect.AnnotatedElement;
            import java.lang.reflect.TypeVariable;
            import java.util.Collection;
            
            public final class OOoO0OoIIO extends OOoI1O implements O00l0Oi0o, O00lI00ll {
                public final TypeVariable I00000oIO;

                public OOoO0OoIIO(TypeVariable typeVariable) {
/* 4 */             this.I00000oIO = typeVariable;
                }

                @Override
                public final OOo1O1i I00000oIO(Ill0IO ill0IO) {
                    Annotation[] declaredAnnotations;
/* 1 */             TypeVariable typeVariable = this.I00000oIO;
/* 11 */            AnnotatedElement annotatedElement = typeVariable instanceof AnnotatedElement ? (AnnotatedElement) typeVariable : null;
/* 12 */            if (annotatedElement == null || (declaredAnnotations = annotatedElement.getDeclaredAnnotations()) == null) {
/* 5 */                 return null;
                    }
/* 20 */            return lIlIi0Ii1.I00000oIO(declaredAnnotations, ill0IO);
                }

                public final boolean equals(Object obj) {
/* 3 */             if (obj instanceof OOoO0OoIIO) {
                        return O0000Ioio00.I0000O(this.I00000oIO, ((OOoO0OoIIO) obj).I00000oIO);
                    }
/* 19 */            return false;
                }

                @Override
                public final Collection getAnnotations() {
                    Annotation[] declaredAnnotations;
/* 1 */             TypeVariable typeVariable = this.I00000oIO;
/* 10 */            AnnotatedElement annotatedElement = typeVariable instanceof AnnotatedElement ? (AnnotatedElement) typeVariable : null;
/* 24 */            return (annotatedElement == null || (declaredAnnotations = annotatedElement.getDeclaredAnnotations()) == null) ? Il01100l.I00iOIl : lIlIi0Ii1.I00000oOI(declaredAnnotations);
                }

                public final int hashCode() {
/* 3 */             return this.I00000oIO.hashCode();
                }

                public final String toString() {
/* 22 */            return OOoO0OoIIO.class.getName() + ": " + this.I00000oIO;
                }
            }
