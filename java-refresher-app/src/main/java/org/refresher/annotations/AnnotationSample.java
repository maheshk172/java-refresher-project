package org.refresher.annotations;

public class AnnotationSample {

	public static void main(String[] args) {
		//AnnotationSample annotationSample = new AnnotationSample();
		ModelObject mo1 = new TableModelObject();
        TableModelObject to1 = new TableModelObject();
		mo1.setModelWithData();
        ((ModelObject)mo1).setModelWithData();

        ((ModelObject)to1).setModelWithData();
	}

}

//@Entity(tableName = "vehicles")
class ModelObject {
	@Deprecated
	/*
	 * @deprecated Use another method which should work
	 */
	public void setModelWithData() {
		System.out.println("Setting default model data");
	}
}

@MyAnnotation(
        age = "10",
        name="Tony",
        newNames ={"Dobby", "Toddy"}
)
class TableModelObject extends ModelObject{
    @Override
    public void setModelWithData() {
//        super.setModelWithData();
        System.out.println("Table Model Object Setting default data");
    }
}


