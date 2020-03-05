import java.util.*;

class CustomListCreation<Object> extends AbstractList<Object> 
{

    Object[] customList;
    int listIndex=0;

   
    CustomListCreation(Object[] array) 
    {
        customList = array;
        listIndex=array.length;
    }
	
    
    public int size()
    {
        return listIndex;
    }
    
    public Object get(int index) 
    {
        return customList[index-1];
    }
    
    public Object getFirstElement()
    {
    	return customList[0];
    }
    
    public Object getLastElement()
    {
    	return customList[customList.length-1];
    }
    
    public List getCompleteList()
    {
    	List list1=Arrays.asList(customList);
    	return list1;
    	
    }

    public void append(Object element)
    {
    	customList=Arrays.copyOf(customList,listIndex+1);
    	customList[listIndex]=element;
    	listIndex++;    	
    }
    
    public void insertElement(int index,Object element)
    {
    	Object array[]=null;
    	array=Arrays.copyOf(customList,listIndex+1);
    	int i;
    	int k=0;
    	
    	for(i=0;i<listIndex+1;i++)
    	{
    		if(i == index-1)
    		{
    			array[i]=element;
    		}
    		else
    		{
    			array[i]=customList[k++];
    		}
    	}
    	
    	listIndex++;
    	customList=Arrays.copyOf(array,listIndex);
   	
    }
    
    public Object setListElement(int index, Object element) 
    {
    	index-=1;
        Object oldValue = customList[index];
        customList[index] = element;
        return oldValue;
    }
    
    public Object remove(int index)
    {
    	Object removedElement=customList[index-1];
    	int i;
    	int k=0;
    	Object array[]=null;
    	array=Arrays.copyOf(customList,listIndex);
    	
    	for(i=0;i<listIndex;i++)
    	{
    		if(i == index-1)
    			continue;
    		array[k++]=customList[i];
    		
    	}
    	
    	listIndex--;
    	customList=Arrays.copyOf(array,listIndex);
    	
       	return removedElement;
    }

	
}